package com.example.bugcheck.utils;

import com.example.bugcheck.BugcheckApplication;
import com.example.bugcheck.pojo.table.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CodeTest {


    private Code code=new Code();
    private String email="1449722625";
    private String codeValue="12313";


    @BeforeEach
    void setUp() {
        code.setUsername(email);
        code.setCodeValue(codeValue);
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        code=null;
    }

    @Test
    void setUsername() {
        code.setUsername(email);
        assertEquals(email,code.getUsername());
    }

    @Test
    void getUsername() {
        assertEquals(email,code.getUsername());
    }

    @Test
    void setCodeValue() {
        code.setCodeValue(codeValue);
        assertEquals(codeValue,code.getCodeValue());
    }

    @Test
    void getCodeValue() {
        assertEquals(codeValue,code.getCodeValue());
    }


    @Test
    void setEmail() {
        code.setUsername(email);
        assertEquals(email,code.getUsername());
    }

    @Test
    void getEmail() {
        assertEquals(email,code.getUsername());
    }


}