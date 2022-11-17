package com.example.bugcheck.service.impl;

import com.example.bugcheck.mapper.DataMapper;
import com.example.bugcheck.mapper.UserMapper;
import com.example.bugcheck.pojo.table.Data;
import com.example.bugcheck.pojo.table.DataExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataServiceImplTest {

    File file = new File("C://Users//lenovo//Desktop//repository//bug_test_project//bugcheck//src//main//java//com//example//bugcheck//file//JDT.csv");

    @Autowired
    private DataServiceImpl dataService;

    @Test
    void result() {
        List< Data > dataList = new LinkedList<>();
        assertEquals(0,dataService.result(dataList));
    }

    @Test
    void write() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        assertEquals(200,dataService.write(mFile));
    }

    @Test
    void addFile() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        assertEquals(200,dataService.addFile(mFile));
    }

    @Test
    void logicalRegression() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        dataService.write(mFile);
        double[][] info = dataService.data();
        //测试逻辑回归算法，准确率大于0.5即可通过
        assertFalse(dataService.logicalRegression(info) <= 0.5);
    }

    @Test
    void data() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        dataService.write(mFile);
        double[][] info = dataService.data();
        //查看原文件得：  第12行第2列值为0.000617   第28行第3列值为0.000855
        //即应得：info[11][1] = 0.000617   info[27][2] = 0.000855
        assertEquals(0.000617,info[11][1]);
        assertEquals(0.000855,info[27][2]);
    }

    @Test
    void KNN() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        dataService.write(mFile);
        double[][] info = dataService.data();
        //测试KNN算法，准确率大于0.5即可通过
        assertFalse(dataService.KNN(info) <= 0.5);
    }

    @Test
    void perceptron() throws IOException {
        MultipartFile mFile = new MockMultipartFile("file",file.getName(),null,new FileInputStream(file));
        dataService.write(mFile);
        double[][] info = dataService.data();
        //测试感知机算法，准确率大于0.5即可通过
        assertFalse(dataService.Perceptron(info) <= 0.5);
    }

    @Test
    void readCsvByBufferedReader() {
        ArrayList<String> a = DataServiceImpl.readCsvByBufferedReader("C://Users//lenovo//Desktop//repository//bug_test_project//bugcheck//src//main//java//com//example//bugcheck//file//JDT.csv");;
        //查看原文件得：第11行值同test1  第29行值同test2
        String test1  = "0,0,0.003249,6,0,0,0.019258,0,1.01,0,7.52192,0,0,0,3,0,1,15,0,0,0.180872,0,0.003617,1.1,7,58,3,5,2,4,0,0,10,3.08,28,0.001023,0,0.001721,1.05,0,10,1.2,3,0,0,1,0,0,2.06,0.011839,2.1,6,0.000837,0.002221,0.001061,10,5,0.004289,2.34,0.001893,0,buggy";
        String test2  = "0,0,0.000855,5,0,0,0.004269,0,1.01,0,10.9152,0,0,0,5,2,0,37,0,0,8.15351,0,0.042401,0,7,115,56,10,5,10,0,1.02,45,17.12,22,0,0,0,0,0,17,0,5,0,0,0,0,0.001409,1.01,0.131131,25.5,5,0,0.060148,0,197,10,0.000906,0,0.164666,0,buggy";
        assertEquals(test1,a.get(10));
        assertEquals(test2,a.get(28));
    }
}