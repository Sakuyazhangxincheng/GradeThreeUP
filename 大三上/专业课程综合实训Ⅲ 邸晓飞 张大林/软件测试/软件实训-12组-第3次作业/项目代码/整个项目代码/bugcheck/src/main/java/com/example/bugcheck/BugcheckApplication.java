package com.example.bugcheck;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.bugcheck.mapper"})
public class BugcheckApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugcheckApplication.class, args);
    }

}
