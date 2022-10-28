package com.example.bugcheck.service.impl;

import com.example.bugcheck.pojo.table.Data;

import java.io.*;
import java.util.*;
import static com.example.bugcheck.utils.Global.FAIL;
import static com.example.bugcheck.service.impl.DataServiceImpl.readCsvByBufferedReader;

public class KNN {


    public double excute(int k, int feature, double[][] info) {
        try {

            //List<Double[]> trains = FileUtils.readDoubles(trainPath, "\t");
            //List<Double[]> tests  = FileUtils.readDoubles(testPath, "\t");






            int train_len = 900;
            int test_len = 997 - train_len;
            //数组拆分为训练集和测试集
            Double[][] train_data = new Double[train_len][62];
            Double[][] test_data = new Double[test_len][62];
            for(int j=0; j<train_len; j++)
                System.arraycopy(info[j], 0, train_data[j], 0, 62);
            for(int j=0; j<test_len; j++)
                System.arraycopy(info[j+train_len], 0, test_data[j], 0, 62);

            //DrawPic drawPic = new DrawPic();
            List<Double[]> trains = new ArrayList<>();
            List<Double[]> tests  = new ArrayList<>();
            for(int i=0; i < train_data.length; i++)
                trains.add(train_data[i]);
            for(int i=0; i < test_data.length; i++)
                tests.add(test_data[i]);

            double crr = 0.0;
            for (Double[] test : tests) {
                Map<String, Object> classifyResult = cal(test,trains,k,feature);
                Double type = Double.parseDouble(classifyResult.get("type")+"");
                //test[feature] = type+2;
                System.out.println(type + "|" + test[feature]);
                //System.out.println(classifyResult.toString());

                if(type.equals(test[feature]))
                    crr++;
            }
            double accuracy = crr/tests.size();
            System.out.println("Acc:" + accuracy);
            return accuracy;

            //drawPic.add(trains, 0d);
            //drawPic.add(trains, 1d);
            //drawPic.add(tests, 2d);
            //drawPic.add(tests, 3d);
            //drawPic.draw("KNN TEST RESULT:");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return FAIL;
    }


    public Double euclidDistance(Double[] a, Double[] b, int feature){
        double result = 0;
        double tmp = 0;
        for (int i = 0; i < feature ; i++) {
            tmp = tmp + Math.pow(a[i]-b[i],2);
        }
        result = Math.sqrt(tmp);
        return result;
    }

    public Map<String,Object > cal(Double[] centerPoint, List<Double[]> data, int k, int feature) {
        //计算所有已知点到未知点的欧式距离
        List<Map<String, Object>> tmpList = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < data.size(); i++) {
            Double[] bArr = data.get(i);
            Double euclidDis = euclidDistance(centerPoint, bArr,feature);
            if (euclidDis==0)  continue;
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("dis", euclidDis);
            map.put("index", i);
            map.put("type", bArr[feature]);
            tmpList.add(map);
        }

        //根据距离对所有已知点排序
        Collections.sort(tmpList, new Comparator<Map<String, Object>>() {
            public int compare(Map<String, Object> f1, Map<String, Object> f2) {
                double d1 = (double) f1.get("dis");
                double d2 = (double) f2.get("dis");
                if (d1 > d2) {
                    return 1;
                } else if (d1 < d2) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //选取最近的k个点
        List<Map<String, Object>> tmpListSub = tmpList.subList(0, k);

        // 计算每个分类包含的点的个数
        Map<String,Integer> classify = new HashMap<>();
        for (Map<String, Object> map : tmpListSub) {
            String type = map.get("type")+"";
            classify.merge(type,1,Integer::sum);
        }
        // 找出最大频率
        double value = 0.0;
        String type = "";
        for (Map.Entry<String, Integer> entry : classify.entrySet()) {
            if (entry.getValue() > value) {
                type = entry.getKey();
                value = entry.getValue();
            }
        }
        Map<String,Object> result = new HashMap<>();
        result.put("knn_point",tmpListSub);
        result.put("type",type);
        return result;
    }
    public ArrayList<String> readCsvByBufferedReader(String filePath) {
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
        try {
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                records.add(line);
            }
            //System.out.println("csv表格读取行数：" + records.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }

}
