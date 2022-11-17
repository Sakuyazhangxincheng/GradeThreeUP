package com.example.bugcheck.service.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerceptronModel {

    public double eta = 0.1;//步长，默认为1
    public double[] w = new double[61];
    public int b = 7;

    public List<Point> arrayList;

    /*
     * 判断所有点的位置关系,进行分类
     */
    public boolean classify() {
        int r = 0;
        boolean flag = false;
        while (!flag) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (Anwser(arrayList.get(i)) <= 0) {
                    Update(arrayList.get(i));
                    r++;
                    break;
                }
                if (i + 1 == arrayList.size()) {
                    flag = true;
                }
            }
            if(r >5000) break;
        }
        return true;
    }

    /*
     * 点乘返回sum
     */
    private double Dot(double[] w, double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += w[i] * x[i];
        }
        return sum;
    }

    /*
     * 返回函数计算的值
     */
    private double Anwser(Point point) {
        System.out.println("w:"+ Arrays.toString(w));
        System.out.println("b:"+b);
        return point.y * (Dot(w, point.x) + b);
    }

    public void Update(Point point) {
        for (int i = 0; i < w.length; i++) {
            w[i] += eta * point.y * point.x[i];
        }
        b += eta * point.y;
    }

    public static ArrayList<String> readCsvByBufferedReader(String filePath) {
        File csv = new File(filePath);
        csv.setReadable(true);
        csv.setWritable(true);
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            isr = new InputStreamReader(new FileInputStream(csv), "UTF-8");
            br = new BufferedReader(isr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line = "";
        ArrayList<String> records = new ArrayList<>();
        while (true) {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.println(line);
            records.add(line);
        }
        System.out.println("csv表格读取行数：" + records.size());
        return records;
    }
}


