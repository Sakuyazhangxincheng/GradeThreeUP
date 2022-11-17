package com.example.bugcheck.utils;

import com.example.bugcheck.pojo.table.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ReturnObjectTest<T> {

    private User user=new User();
    private int code=234123;
    private ReturnObject<T> returnObject=new ReturnObject<T>(code, (T) user);
    ReturnObjectTest returnObjectTest;
    @BeforeEach
    void setUp() {
        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");

    }

    @Test
    void getObject() {
        assertEquals(user,returnObject.getObject());
    }

    @Test
    void setObject() {
        returnObject.setObject((T)user);
        assertEquals(user,returnObject.getObject());
    }

    @Test
    void getCode() {
        assertEquals(code,returnObject.getCode());
    }

    @Test
    void setCode() {
        returnObject.setCode(code);
        assertEquals(code,returnObject.getCode());
    }
}