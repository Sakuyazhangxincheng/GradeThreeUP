package com.example.bugcheck.controller;

import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.service.CodeService;
import com.example.bugcheck.service.DataService;
import com.example.bugcheck.service.UserService;
import com.example.bugcheck.utils.Code;
import com.example.bugcheck.utils.Global;
import com.example.bugcheck.utils.ReturnObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import static com.example.bugcheck.utils.Global.*;



@Controller
public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private CodeService codeService;
    @Autowired
    private DataService dataService;


    @RequestMapping("/")
    public String index() {
        return "Login";
    }


    @RequestMapping("/toMain")
    public String mainFromLogin() {
        return "main";
    }

    @RequestMapping("/toLogin")
    public String loginFromRegister() {
        return "Login";
    }
    @RequestMapping("/toRegister")
    public String registerFromLogin() {
        return "Register";
    }

    @RequestMapping("/toUserCenter")
    public String userCenterFromMain() {
        return "information";
    }

    @RequestMapping("/toChangePassword")
    public String changePasswordFromUserCenter() {
        return "ChangePassword";
    }
    @RequestMapping("/toChangeEmail")
    public String changeEmailFromUserCenter() {
        return "ChangeEmailAddress";
    }

    @GetMapping("/register/sendCode/{email}/{type}")
    @ResponseBody
    public String sendCode(@PathVariable("email")String email,@PathVariable("type")int type){
        int result = codeService.sendCode(email, type);
        if (type == 1) {

        }
        return String.valueOf(result);
    }

    @GetMapping("/changeEmailAddress/{username}/{email}/{code}")
    @ResponseBody
    public String changeEmail(@PathVariable("username")String username,@PathVariable("email")String email,@PathVariable("code")String code){

        int checkCode = codeService.checkCode(new Code(email, code), CHANGE);
        if (checkCode == SUCCESS)
        {
            return  String.valueOf(userService.changeEmail(username,email));
        } else {
            return  String.valueOf(CODE_ERROR);
        }
    }
    @GetMapping("/changePassword/{username}/{password}")
    @ResponseBody
    public String changePassword(@PathVariable("username")String username,@PathVariable("password")String password){
        return String.valueOf(userService.changePassword(username,password));
    }



    @GetMapping("/login/{username}/{password}")
    @ResponseBody
    public ReturnObject<User> loginUser(@PathVariable("username")String username,
                                        @PathVariable("password")String password
                                        ){
        //System.out.println("123");
        User user = userService.loginUser(username,password);
        if(user==null){
            return new ReturnObject<>(Global.ERROR, null);
        }else {
        }
        return new ReturnObject<>(SUCCESS, user);
    }

    @GetMapping("/register/{username}/{password}/{email}/{code}")
    @ResponseBody
    public String register(@PathVariable("username")String username,
                                       @PathVariable("password")String password,
                                       @PathVariable("email")String email,
                                       @PathVariable("code")String code){
        User user=new User();
        user.setEmail(email);
        user.setName(username);
        user.setPassword(password);
        int checkCode = codeService.checkCode(new Code(email, code), Global.REGISTER);
        if (checkCode == SUCCESS)
        {
            User user1 = userService.registerUser(user);
            if(user1==null){
                return String.valueOf(NAME_EXIST);
            }
            return String.valueOf(SUCCESS);
        } else {
            return  String.valueOf(CODE_ERROR);
        }
    }

    @GetMapping("/index")
    public String toMe(){
        return "index";
    }
    }
