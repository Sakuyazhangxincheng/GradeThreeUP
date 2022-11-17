package com.example.bugcheck.config;

import com.example.bugcheck.service.CodeService;
import com.example.bugcheck.service.impl.CodeServiceImpl;
import com.example.bugcheck.utils.Global;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisConfigTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    CodeServiceImpl codeService;
    @BeforeEach
    void setUp() {
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");
    }

    @Test
    void redisTemplate() {
        String email="1449722625@qq.com";
        int times = codeService.getSendTimes(email, Global.REGISTER);
        long codeL = System.nanoTime();
        String codeStr = Long.toString(codeL);
        codeStr = codeStr.substring(codeStr.length() - 8, codeStr.length() - 2);
        String key_code = email + "_register_code";
        String key_times = email + "_register_times";
        redisTemplate.opsForValue().set(key_code,codeStr,60*5, TimeUnit.SECONDS);//验证码有效时间是5分钟
        redisTemplate.opsForValue().set(key_times,String.valueOf(times+1),1, TimeUnit.HOURS);//更新最近验证码发送时间

    }
}