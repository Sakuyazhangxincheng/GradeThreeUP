package com.example.bugcheck.service;

import com.example.bugcheck.pojo.table.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DataService {


    double result(List<Data> dataList);

    int write(MultipartFile upload);

    int addFile(MultipartFile upload);

    double logicalRegression(double[][] info);

    double[][] data();

    double KNN(double[][] info);

    double Perceptron(double[][] info);
}
