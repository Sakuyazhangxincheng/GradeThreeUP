package com.example.bugcheck.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    void Point() {
        Point point = new Point(new double[]{1.0, 2.0, 3.0}, 4.0);
    }
}