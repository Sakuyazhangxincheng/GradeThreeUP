package com.example.bugcheck;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BugcheckApplicationTest {


    @BeforeEach
    void setUp() {

        System.out.println("test prepare is finished");
    }

    @AfterEach
    void tearDown() {
        System.out.println("test finisher");

    }

    @Test
    void main() {
    }
}