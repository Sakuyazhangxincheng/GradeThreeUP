package com.example.bugcheck.controller;

import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.User;
import com.example.bugcheck.pojo.table.UserExample;
import com.example.bugcheck.service.impl.UserServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static com.example.bugcheck.utils.Global.CODE_ERROR;
import static com.example.bugcheck.utils.Global.SUCCESS;

@SpringBootTest
class UserControllerTest {
    @Autowired
    UserController uc;
    @Autowired
    private UserMapper userMapper;
//    @Autowired
//    private CodeService codeService;

    @BeforeEach
    void setUp() {
        System.out.println("test prepare is finishing");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test has finished");
    }

    @Test
    void index() {
    }

    @Test
    void mainFromLogin() {
    }

    @Test
    void loginFromRegister() {
    }

    @Test
    void registerFromLogin() {
    }

    @Test
    void userCenterFromMain() {
    }

    @Test
    void changePasswordFromUserCenter() {
    }

    @Test
    void changeEmailFromUserCenter() {
    }

    @Test
    void sendCode() {
        assertEquals(SUCCESS,uc.sendCode("20301055@bjtu.edu.cn",1));
    }

    @Test
    void changeEmail() {
//        234213    3216232944@qq.com  code
        assertEquals(CODE_ERROR,uc.changeEmail("234213","20301055@bjtu.edu.cn","752774"));
    }

    @Test
    void changePassword() {
        assertEquals(SUCCESS,uc.changePassword("zcx","123213213"));
//        assertEquals();
    }

    @Test
    void loginUser() {
    }

    @Test
    void register() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(1);
        List<User> users =userMapper.selectByExample(userExample);
        //assertEquals(null,new UserServiceImpl().registerUser(users.get(0)));
        users.get(0).setId(124);
        users.get(0).setName("1232123");
        assertEquals(201,uc.register(users.get(0).getName(),users.get(0).getPassword(),users.get(0).getEmail(),"748976"));

    }

    @Test
    void toMe() {
        assertEquals("index",uc.toMe());
    }
}
