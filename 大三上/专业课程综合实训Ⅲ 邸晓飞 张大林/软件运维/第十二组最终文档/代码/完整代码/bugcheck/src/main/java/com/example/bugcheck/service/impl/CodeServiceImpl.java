package com.example.bugcheck.service.impl;

import com.example.bugcheck.utils.Code;
import com.example.bugcheck.utils.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.bugcheck.service.CodeService;

import java.util.concurrent.TimeUnit;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private RedisTemplate redisTemplate;

    @Value("${spring.mail.from}")
    private String from;//配置文件里的from信息

    @Override
    public int sendCode( String email,int type) {
        if (type == Global.REGISTER){
            return sendCodeRegister(email);
        }else if (type == Global.CHANGE){
            return sendCodeFind(email);
        }
        return Global.FAIL;
    }


    @Override
    public int sendCodeRegister(String email){
        int times = getSendTimes(email,Global.REGISTER);
        if (times <= 10){ //每个邮箱每1小时只能发送5次
            long codeL = System.nanoTime();//返回最准确的可用系统计时器的当前值
            //先生成6位验证码
            String codeStr = Long.toString(codeL);
            codeStr = codeStr.substring(codeStr.length() - 8, codeStr.length() - 2);
            //存入redis
            String key_code = email + "_register_code";
            String key_times = email + "_register_times";
            redisTemplate.opsForValue().set(key_code,codeStr,60*5,TimeUnit.SECONDS);//验证码有效时间是5分钟
            redisTemplate.opsForValue().set(key_times,String.valueOf(times+1),1, TimeUnit.HOURS);//更新最近验证码发送时间
            //发送到用户邮箱
            String content = "你好，欢迎使用本软件,您的验证码是:"+ codeStr +",有效时间5分钟";
            sendSimpleMail(email,"注册验证码",content);
            return Global.SUCCESS;
        }
        return Global.FAIL;
    }

    @Override
    public int sendCodeFind(String email){
        int times = getSendTimes(email,Global.CHANGE);
        if (times <= 10){ //每个用户每1小时只能发送5次
            long codeL = System.nanoTime();
            //先生成6位验证码
            String codeStr = Long.toString(codeL);
            codeStr = codeStr.substring(codeStr.length() - 8, codeStr.length() - 2);
            //存入redis
            String key_code = email + "_find_code";
            String key_times = email + "_find_times";
            redisTemplate.opsForValue().set(key_code,codeStr,60*5, TimeUnit.SECONDS);//验证码有效时间是5分钟
            redisTemplate.opsForValue().set(key_times,String.valueOf(times+1),1, TimeUnit.HOURS);//更新最近验证码发送时间
            //发送到用户邮箱
            String content = "你好，欢迎使用本软件,验证码是:"+ codeStr +",有效时间5分钟";
            sendSimpleMail(email,"修改邮箱验证码",content);
            return Global.SUCCESS;
        }
        return Global.FAIL;
    }


    @Override
    public int checkCode(Code code, int type) {
        String realCode = getCode(code.getEmail(), type);
        if (realCode.equals(code.getCodeValue())){
            return Global.SUCCESS;
        }
        return Global.FAIL;
    }

    @Override
    public int getSendTimes(String email, int type) {
        String key = email + "_";
        if (type == Global.REGISTER){
            key += "register_times";
        }else {
            key += "find_times";
        }
        Object result = redisTemplate.opsForValue().get(key);
        if (result == null){
            return 0;
        }

        return Integer.parseInt((String) result);
    }

    @Override
    public String getCode(String email, int type) {
        String key = email + "_";
        if (type == Global.REGISTER){
            key += "register_code";
        }else {
            key += "find_code";
        }
        Object result = redisTemplate.opsForValue().get(key);
        if (result == null){
            return "";
        }
        return (String) result;
    }

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        //发件人
        message.setFrom(from);
        //收件人
        message.setTo(to);
        //邮件主题
        message.setSubject(subject);
        //邮件内容
        message.setText(content);
        //发送邮件
        javaMailSender.send(message);
    }
}
