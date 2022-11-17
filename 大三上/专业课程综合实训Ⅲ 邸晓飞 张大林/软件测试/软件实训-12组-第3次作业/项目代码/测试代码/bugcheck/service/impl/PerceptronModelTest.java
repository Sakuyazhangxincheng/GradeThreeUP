package com.example.bugcheck.service.impl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PerceptronModelTest {

    @Test
    void readCsvByBufferedReader() {
        ArrayList<String> arrayList = new ArrayList<String>();
        PerceptronModel p = new PerceptronModel();
        arrayList = p.readCsvByBufferedReader("src//main//java//com//example//bugcheck//file//JDT.csv");
    }
}