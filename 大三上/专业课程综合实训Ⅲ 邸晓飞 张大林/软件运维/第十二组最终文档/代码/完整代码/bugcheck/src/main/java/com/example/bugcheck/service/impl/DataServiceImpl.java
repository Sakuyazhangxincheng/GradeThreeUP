package com.example.bugcheck.service.impl;

import com.example.bugcheck.mapper.DataMapper;
import com.example.bugcheck.pojo.table.Data;
import com.example.bugcheck.pojo.table.DataExample;
import com.example.bugcheck.service.DataService;
import com.example.bugcheck.utils.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.example.bugcheck.utils.Global.*;
import static java.lang.Math.random;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataMapper dataMapper;


    @Override
    public double result(List<Data> dataList) {
        return 0;
    }

    @Override
    public int write(MultipartFile upload) {

        // 1. 获取要上传文件的文件名
        String fileName = upload.getOriginalFilename();
        String filePath = Global.FILE_PATH +"//"+fileName; //文件路径

        //删除数据库的内容
        dataMapper.deleteByExample(null);


        ArrayList<Data> dataList = new ArrayList<>();

        ArrayList<String> records = new ArrayList<>();
        records = readCsvByBufferedReader(filePath);

        for(int x=1; x<records.size(); x++) {
            String[] lineRecords = records.get(x).split(",");
            Data data = new Data();
            data.setId(x);
            data.setCkOoNumberofprivatemethods(Double.valueOf(lineRecords[0]));
            data.setLdhhLcom(Double.valueOf(lineRecords[1]));
            data.setLdhhFanin(Double.valueOf(lineRecords[2]));
            data.setNumberofnontrivialbugsfounduntil(Double.valueOf(lineRecords[3]));
            data.setWchuNumberofpublicattributes(Double.valueOf(lineRecords[4]));
            data.setWchuNumberofattributes(Double.valueOf(lineRecords[5]));
            data.setCvswentropy(Double.valueOf(lineRecords[6]));
            data.setLdhhNumberofpublicmethods(Double.valueOf(lineRecords[7]));
            data.setWchuFanin(Double.valueOf(lineRecords[8]));
            data.setLdhhNumberofprivateattributes(Double.valueOf(lineRecords[9]));
            data.setCvsentropy(Double.valueOf(lineRecords[10]));

            data.setLdhhNumberofpublicattributes(Double.valueOf(lineRecords[11]));
            data.setWchuNumberofpublicmethods(Double.valueOf(lineRecords[12]));
            data.setWchuNumberofmethods(Double.valueOf(lineRecords[13]));
            data.setCkOoNumberofpublicattributes(Double.valueOf(lineRecords[14]));
            data.setCkOoNoc(Double.valueOf(lineRecords[15]));
            data.setNumberofcriticalbugsfounduntil(Double.valueOf(lineRecords[16]));
            data.setCkOoWmc(Double.valueOf(lineRecords[17]));
            data.setLdhhNumberofprivatemethods(Double.valueOf(lineRecords[18]));
            data.setWchuNumberofprivateattributes(Double.valueOf(lineRecords[19]));
            data.setWchuNoc(Double.valueOf(lineRecords[20]));

            data.setCkOoFanout(Double.valueOf(lineRecords[21]));
            data.setCvslogentropy(Double.valueOf(lineRecords[22]));
            data.setLdhhNumberofattributesinherited(Double.valueOf(lineRecords[23]));
            data.setCkOoNumberoflinesofcode(Double.valueOf(lineRecords[24]));
            data.setCkOoDit(Double.valueOf(lineRecords[25]));
            data.setWchuWmc(Double.valueOf(lineRecords[26]));
            data.setLdhhNoc(Double.valueOf(lineRecords[27]));
            data.setCkOoNumberofmethods(Double.valueOf(lineRecords[28]));
            data.setCkOoNumberofattributesinherited(Double.valueOf(lineRecords[29]));
            data.setWchuDit(Double.valueOf(lineRecords[30]));

            data.setCkOoLcom(Double.valueOf(lineRecords[31]));
            data.setCkOoFanin(Double.valueOf(lineRecords[32]));
            data.setWchuNumberofattributesinherited(Double.valueOf(lineRecords[33]));
            data.setCkOoRfc(Double.valueOf(lineRecords[34]));
            data.setLdhhWmc(Double.valueOf(lineRecords[35]));
            data.setLdhhNumberofattributes(Double.valueOf(lineRecords[36]));
            data.setLdhhNumberoflinesofcode(Double.valueOf(lineRecords[37]));
            data.setWchuFanout(Double.valueOf(lineRecords[38]));
            data.setWchuLcom(Double.valueOf(lineRecords[39]));
            data.setCkOoCbo(Double.valueOf(lineRecords[40]));

            data.setWchuRfc(Double.valueOf(lineRecords[41]));
            data.setCkOoNumberofattributes(Double.valueOf(lineRecords[42]));
            data.setNumberofhighprioritybugsfounduntil(Double.valueOf(lineRecords[43]));
            data.setCkOoNumberofprivateattributes(Double.valueOf(lineRecords[44]));
            data.setNumberofmajorbugsfounduntil(Double.valueOf(lineRecords[45]));
            data.setWchuNumberofpublicmethods(Double.valueOf(lineRecords[46]));
            data.setLdhhDit(Double.valueOf(lineRecords[47]));
            data.setWchuCbo(Double.valueOf(lineRecords[48]));
            data.setCvslinentropy(Double.valueOf(lineRecords[49]));
            data.setWchuNumberofmethodsinherited(Double.valueOf(lineRecords[50]));

            data.setNumberofbugsfounduntil(Double.valueOf(lineRecords[51]));
            data.setLdhhFanout(Double.valueOf(lineRecords[52]));
            data.setLdhhNumberofmethodsinherited(Double.valueOf(lineRecords[53]));
            data.setLdhhRfc(Double.valueOf(lineRecords[54]));
            data.setCkOoNumberofmethodsinherited(Double.valueOf(lineRecords[55]));
            data.setCkOoNumberofpublicmethods(Double.valueOf(lineRecords[56]));
            data.setLdhhCbo(Double.valueOf(lineRecords[57]));
            data.setWchuNumberoflinesofcode(Double.valueOf(lineRecords[58]));
            data.setCvsexpentropy(Double.valueOf(lineRecords[59]));
            data.setLdhhNumberofmethods(Double.valueOf(lineRecords[60]));

            if(lineRecords[61].equals("clean"))
                data.setClasses(1.0);
            else if (lineRecords[61].equals("buggy"))
                data.setClasses(0.0);

            dataList.add(x-1, data);
            //break;
        }
        for(int z=0;z<dataList.size();z++)
        {
            dataMapper.insert(dataList.get(z));
        }

        return SUCCESS;
    }

    @Override
    public int addFile(MultipartFile upload) {
        // 1. 获取要上传文件的文件名
        String fileName = upload.getOriginalFilename();
        // 2. 自定义上传文件夹
        String path = Global.FILE_PATH;
        // 3. 判断路径是否存在，不存在则新建
        File file  = new File(path);
        if (!file.exists()){
            file.mkdir();
        }
        String filePath = path+"//"+fileName; //文件路径
        File newFile = new File(filePath);
        try {
            upload.transferTo(newFile);
            return SUCCESS;
        } catch (IOException e) {
            e.printStackTrace();
            return Global.FAIL;
        }
    }

    @Override
    public double logicalRegression(double[][] info) {
        DataExample dataExample = new DataExample();
        dataExample.createCriteria().andIdIsNotNull();
        int length=dataMapper.countByExample(dataExample);
        int train_len = length*4/5;
        int test_len = length - train_len;
        //数组拆分为训练集和测试集
        double[][] train_data = new double[train_len][62];
        double[][] test_data = new double[test_len][62];
        for(int j=0; j<train_len; j++)
            System.arraycopy(info[j], 0, train_data[j], 0, 62);
        for(int j=0; j<test_len; j++)
            System.arraycopy(info[j+train_len], 0, test_data[j], 0, 62);
        //System.out.println();

        LogicalRegressionModel model = new LogicalRegressionModel();
        model.train(766, 100, train_data);


        return model.getAccuracy(test_data);
    }



    @Override
    public double[][] data() {

        List<Data> dataList = new ArrayList<>();
        dataList=dataMapper.selectByExample(null);
        DataExample dataExample=new DataExample();
        dataExample. createCriteria().andIdIsNotNull();
        int length=dataMapper.countByExample(dataExample);
        double[][] info = new double[length][62];
        for(int j=0; j<dataList.size(); j++) {

            info[j][0] = dataList.get(j).getCkOoNumberofprivatemethods();
            info[j][1] = dataList.get(j).getLdhhLcom();
            info[j][2] = dataList.get(j).getLdhhFanin();
            info[j][3] = dataList.get(j).getNumberofnontrivialbugsfounduntil();
            info[j][4] = dataList.get(j).getWchuNumberofpublicattributes();
            info[j][5] = dataList.get(j).getWchuNumberofattributes();
            info[j][6] = dataList.get(j).getCvswentropy();
            info[j][7] = dataList.get(j).getLdhhNumberofpublicmethods();
            info[j][8] = dataList.get(j).getWchuFanin();
            info[j][9] = dataList.get(j).getLdhhNumberofprivateattributes();
            info[j][10] = dataList.get(j).getCvsentropy();
            info[j][11] = dataList.get(j).getLdhhNumberofpublicattributes();
            info[j][12] = dataList.get(j).getWchuNumberofpublicmethods();
            info[j][13] = dataList.get(j).getWchuNumberofmethods();
            info[j][14] = dataList.get(j).getCkOoNumberofpublicattributes();
            info[j][15] = dataList.get(j).getCkOoNoc();
            info[j][16] = dataList.get(j).getNumberofcriticalbugsfounduntil();
            info[j][17] = dataList.get(j).getCkOoWmc();
            info[j][18] = dataList.get(j).getLdhhNumberofprivatemethods();
            info[j][19] = dataList.get(j).getWchuNumberofprivateattributes();
            info[j][20] = dataList.get(j).getWchuNoc();

            info[j][21] = dataList.get(j).getCkOoFanout();
            info[j][22] = dataList.get(j).getCvslogentropy();
            info[j][23] = dataList.get(j).getLdhhNumberofattributesinherited();
            info[j][24] = dataList.get(j).getCkOoNumberoflinesofcode();
            info[j][25] = dataList.get(j).getCkOoDit();
            info[j][26] = dataList.get(j).getWchuWmc();
            info[j][27] = dataList.get(j).getLdhhNoc();
            info[j][28] = dataList.get(j).getCkOoNumberofmethods();
            info[j][29] = dataList.get(j).getCkOoNumberofattributesinherited();
            info[j][30] = dataList.get(j).getWchuDit();

            info[j][31] = dataList.get(j).getCkOoLcom();
            info[j][32] = dataList.get(j).getCkOoFanin();
            info[j][33] = dataList.get(j).getWchuNumberofattributesinherited();
            info[j][34] = dataList.get(j).getCkOoRfc();
            info[j][35] = dataList.get(j).getLdhhWmc();
            info[j][36] = dataList.get(j).getLdhhNumberofattributes();
            info[j][37] = dataList.get(j).getLdhhNumberoflinesofcode();
            info[j][38] = dataList.get(j).getWchuFanout();
            info[j][39] = dataList.get(j).getWchuLcom();
            info[j][40] = dataList.get(j).getCkOoCbo();

            info[j][41] = dataList.get(j).getWchuRfc();
            info[j][42] = dataList.get(j).getCkOoNumberofattributes();
            info[j][43] = dataList.get(j).getNumberofhighprioritybugsfounduntil();
            info[j][44] = dataList.get(j).getCkOoNumberofprivateattributes();
            info[j][45] = dataList.get(j).getNumberofmajorbugsfounduntil();
            info[j][46] = dataList.get(j).getWchuNumberofpublicmethods();
            info[j][47] = dataList.get(j).getLdhhDit();
            info[j][48] = dataList.get(j).getWchuCbo();
            info[j][49] = dataList.get(j).getCvslinentropy();
            info[j][50] = dataList.get(j).getWchuNumberofmethodsinherited();

            info[j][51] = dataList.get(j).getNumberofbugsfounduntil();
            info[j][52] = dataList.get(j).getLdhhFanout();
            info[j][53] = dataList.get(j).getLdhhNumberofmethodsinherited();
            info[j][54] = dataList.get(j).getLdhhRfc();
            info[j][55] = dataList.get(j).getCkOoNumberofmethodsinherited();
            info[j][56] = dataList.get(j).getCkOoNumberofpublicmethods();
            info[j][57] = dataList.get(j).getLdhhCbo();
            info[j][58] = dataList.get(j).getWchuNumberoflinesofcode();
            info[j][59] = dataList.get(j).getCvsexpentropy();
            info[j][60] = dataList.get(j).getLdhhNumberofmethods();
            info[j][61] = dataList.get(j).getClasses();
        }

        return info;
    }

    @Override
    public double KNN(double[][] info) {
        KNN knn=new KNN();
        int k=5;int feature=61;
        DataExample dataExample = new DataExample();
        dataExample.createCriteria().andIdIsNotNull();
        int length=dataMapper.countByExample(dataExample);
        try {
            int train_len = length*9/10;
            int test_len = length - train_len;
            //数组拆分为训练集和测试集
            Double[][] train_data = new Double[train_len][62];
            Double[][] test_data = new Double[test_len][62];
            for(int j=0; j<train_len; j++)
                for(int v=0; v<62; v++)
                    train_data[j][v] = info[j][v];
            //System.arraycopy(info[j], 0, train_data[j], 0, 62);
            for(int j=0; j<test_len; j++)
                for(int v=0; v<62; v++)
                    test_data[j][v] = info[j+train_len][v];
            //System.arraycopy(info[j+train_len], 0, test_data[j], 0, 62);
            //DrawPic drawPic = new DrawPic();
            List<Double[]> trains = new ArrayList<>();
            List<Double[]> tests  = new ArrayList<>();
            for(int i=0; i < train_data.length; i++)
                trains.add(train_data[i]);
            for(int i=0; i < test_data.length; i++)
                tests.add(test_data[i]);


            double crr = 0.0;
            for (Double[] test : tests) {
                Map<String, Object> classifyResult = knn.cal(test,trains,k,feature);
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


        /*int k = 5; // 参数一，k近邻
        int feature = 61; // 参数二，特征的个数*/
    }

    public double Perceptron(double[][] info)
    {
        PerceptronModel perceptron=new PerceptronModel();
        int column = 62;
        DataExample dataExample = new DataExample();
        dataExample.createCriteria().andIdIsNotNull();
        int length=dataMapper.countByExample(dataExample);
        int train_len = length*4/5;
        int test_len = length - train_len;
        perceptron.arrayList=new ArrayList<>();


        for(int i=0; i<perceptron.w.length; i++)
            perceptron.w[i] = random()*10;

        //ArrayList<String> records = new ArrayList<>();


        //records = readCsvByBufferedReader("JDT.csv");

        for(int i=0; i< train_len; i++){
            double[] drecord = new double[column];
            double[] tdrecord = new double[drecord.length-1];

            for(int v=0; v< column; v++) {
                drecord[v] = info[i][v];
                if(drecord[drecord.length - 1] == 0.0)
                    drecord[drecord.length - 1] = -1.0;
                if(v != (column-1))
                    tdrecord[v] = drecord[v];
            }

            Point P = new Point(tdrecord, drecord[drecord.length-1]);
            perceptron.arrayList.add(P);
        }
        boolean classify = perceptron.classify();

        double accuracy = 0;
        for(int i=train_len; i<length; i++) {
            double[] drecord = new double[column];
            double[] tdrecord = new double[drecord.length-1];

            for(int v=0; v< column; v++) {
                drecord[v] = info[i][v];
                if(drecord[drecord.length - 1] == 0.0)
                    drecord[drecord.length - 1] = -1.0;
                if(v != (column-1))
                    tdrecord[v] = drecord[v];
            }

            double answer = 0;
            for(int y=0; y<tdrecord.length; y++){
                answer += tdrecord[y] * perceptron.w[y];
            }

            if((answer * drecord[column-1]) > 0)
                accuracy++;
            //System.out.println(drecord[lineRecords.length-1] + "|" + answer);
        }
        accuracy=accuracy/test_len;
        return accuracy;
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
        try {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                records.add(line);
            }
            //System.out.println("csv表格读取行数：" + records.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }


    /*@Autowired(required = false)
    private DataMapper dataMapper;*/
}
