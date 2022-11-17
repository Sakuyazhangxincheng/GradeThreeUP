package com.example.bugcheck.service.impl;

import com.example.bugcheck.pojo.table.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class KNNTest {
    double[][] info = new double[997][62];
    @Test
    void euclidDistance() {
        assertEquals(4, new KNN().euclidDistance(new Double[]{3.0, 4.0, 5.0, 6.0},new Double[]{1.0, 2.0, 3.0, 4.0}, 4));
    }

    @BeforeEach
    void setUp() {
        ArrayList<String> dataList = new ArrayList<>();
        dataList = new KNN().readCsvByBufferedReader("src//main//java//com//example//bugcheck//file//JDT.csv");

        for(int j=0; j<dataList.size()-1; j++) {
            String[] lineRecords = dataList.get(j+1).split(",");
            info[j][0] = Double.valueOf(lineRecords[0]);
            info[j][1] = Double.valueOf(lineRecords[1]);
            info[j][2] = Double.valueOf(lineRecords[2]);
            info[j][3] = Double.valueOf(lineRecords[3]);
            info[j][4] = Double.valueOf(lineRecords[4]);
            info[j][5] = Double.valueOf(lineRecords[5]);
            info[j][6] = Double.valueOf(lineRecords[6]);
            info[j][7] = Double.valueOf(lineRecords[7]);
            info[j][8] = Double.valueOf(lineRecords[8]);
            info[j][9] = Double.valueOf(lineRecords[9]);
            info[j][10] = Double.valueOf(lineRecords[10]);

            info[j][11] = Double.valueOf(lineRecords[11]);
            info[j][12] = Double.valueOf(lineRecords[12]);
            info[j][13] = Double.valueOf(lineRecords[13]);
            info[j][14] = Double.valueOf(lineRecords[14]);
            info[j][15] = Double.valueOf(lineRecords[15]);
            info[j][16] = Double.valueOf(lineRecords[16]);
            info[j][17] = Double.valueOf(lineRecords[17]);
            info[j][18] = Double.valueOf(lineRecords[18]);
            info[j][19] = Double.valueOf(lineRecords[19]);
            info[j][20] = Double.valueOf(lineRecords[20]);

            info[j][21] = Double.valueOf(lineRecords[21]);
            info[j][22] = Double.valueOf(lineRecords[22]);
            info[j][23] = Double.valueOf(lineRecords[23]);
            info[j][24] = Double.valueOf(lineRecords[24]);
            info[j][25] = Double.valueOf(lineRecords[25]);
            info[j][26] = Double.valueOf(lineRecords[26]);
            info[j][27] = Double.valueOf(lineRecords[27]);
            info[j][28] = Double.valueOf(lineRecords[28]);
            info[j][29] = Double.valueOf(lineRecords[29]);
            info[j][30] = Double.valueOf(lineRecords[30]);

            info[j][31] = Double.valueOf(lineRecords[31]);
            info[j][32] = Double.valueOf(lineRecords[32]);
            info[j][33] = Double.valueOf(lineRecords[33]);
            info[j][34] = Double.valueOf(lineRecords[34]);
            info[j][35] = Double.valueOf(lineRecords[35]);
            info[j][36] = Double.valueOf(lineRecords[36]);
            info[j][37] = Double.valueOf(lineRecords[37]);
            info[j][38] = Double.valueOf(lineRecords[38]);
            info[j][39] = Double.valueOf(lineRecords[39]);
            info[j][40] = Double.valueOf(lineRecords[40]);

            info[j][41] = Double.valueOf(lineRecords[41]);
            info[j][42] = Double.valueOf(lineRecords[42]);
            info[j][43] = Double.valueOf(lineRecords[43]);
            info[j][44] = Double.valueOf(lineRecords[44]);
            info[j][45] = Double.valueOf(lineRecords[45]);
            info[j][46] = Double.valueOf(lineRecords[46]);
            info[j][47] = Double.valueOf(lineRecords[47]);
            info[j][48] = Double.valueOf(lineRecords[48]);
            info[j][49] = Double.valueOf(lineRecords[49]);
            info[j][50] = Double.valueOf(lineRecords[50]);

            info[j][51] = Double.valueOf(lineRecords[51]);
            info[j][52] = Double.valueOf(lineRecords[52]);
            info[j][53] = Double.valueOf(lineRecords[53]);
            info[j][54] = Double.valueOf(lineRecords[54]);
            info[j][55] = Double.valueOf(lineRecords[55]);
            info[j][56] = Double.valueOf(lineRecords[56]);
            info[j][57] = Double.valueOf(lineRecords[57]);
            info[j][58] = Double.valueOf(lineRecords[58]);
            info[j][59] = Double.valueOf(lineRecords[59]);
            info[j][60] = Double.valueOf(lineRecords[60]);

            if(lineRecords[61].equals("clean"))
                info[j][61] = 1.0;
            else if (lineRecords[61].equals("buggy"))
                info[j][61] = 0.0;
        }
    }

    @Test
    void excute() {
        assertEquals(-1.0, new KNN().excute(5, 61, info));
    }
}