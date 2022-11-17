package com.example.bugcheck.service.impl;

import com.example.bugcheck.controller.UserController;
import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.pojo.table.UserExample;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static com.example.bugcheck.utils.Global.*;
import static org.junit.jupiter.api.Assertions.*;

//加个注解
@SpringBootTest
class UserServiceImplTest {


    @Autowired
    private UserController userController;
    //自动 new 分配
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserServiceImpl userService;


    @BeforeEach
    void setUp() {
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");

    }

    @Test
    void registerUser() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(1);
        List<User> users =userMapper.selectByExample(userExample);

        assertEquals(null,userService.registerUser(users.get(0)));
        users.get(0).setId(135);
        users.get(0).setName("12321523");

        assertEquals(users.get(0),userService.registerUser(users.get(0)));
    }

    @Test
    void loginUser() {



        UserExample userExample = new UserExample();
        String password="123123";
        String name="zxc";
        userExample.createCriteria().andPasswordEqualTo(password).andNameEqualTo(name);
        List<User> users =userMapper.selectByExample(userExample);

        assertEquals(users.get(0).getName(),userService.loginUser(users.get(0).getName(),users.get(0).getPassword()).getName());
        assertEquals(users.get(0).getId(),userService.loginUser(users.get(0).getName(),users.get(0).getPassword()).getId());
        assertEquals(users.get(0).getPassword(),userService.loginUser(users.get(0).getName(),users.get(0).getPassword()).getPassword());
        assertEquals(users.get(0).getEmail(),userService.loginUser(users.get(0).getName(),users.get(0).getPassword()).getEmail());


        users.get(0).setPassword("123");
        assertEquals(null,userService.loginUser(users.get(0).getName(),users.get(0).getPassword()));
        assertEquals(null,userService.loginUser(users.get(0).getName(),users.get(0).getPassword()));
        assertEquals(null,userService.loginUser(users.get(0).getName(),users.get(0).getPassword()));
        assertEquals(null,userService.loginUser(users.get(0).getName(),users.get(0).getPassword()));
    }

    @Test
    void listUser() {
        List<User> users=userMapper.selectByExample(null);
        for(int i=0;i<users.size();i++)
        {
            assertEquals(users.get(i).getName(),userService.listUser().get(i).getName());
            assertEquals(users.get(i).getId(),userService.listUser().get(i).getId());
            assertEquals(users.get(i).getPassword(),userService.listUser().get(i).getPassword());
            assertEquals(users.get(i).getEmail(),userService.listUser().get(i).getEmail());
        }

    }

    @Test
    void changeEmail() {
        assertEquals(SUCCESS,userService.changeEmail("zcx","123213213"));

        //这个测试用例没有通过
        assertEquals(FAIL,userService.changeEmail("abcabc","4124124"));
    }

    @Test
    void changePassword() {
        assertEquals(SUCCESS,userService.changePassword("zcx","123213213"));

        //这个测试用例没有通过
        assertEquals(FAIL,userService.changePassword("abcabc","4124124"));
    }
}