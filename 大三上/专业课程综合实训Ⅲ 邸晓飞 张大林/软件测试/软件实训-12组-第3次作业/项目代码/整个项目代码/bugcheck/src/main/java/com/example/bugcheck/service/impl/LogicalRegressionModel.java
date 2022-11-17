package com.example.bugcheck.service.impl;

public class LogicalRegressionModel {

    int numOfColumn = 62; //列数
    double[] array_w = new double[numOfColumn]; //权值数组
    double a = 0.01; //学习率
    double loss = 0.0; // 损失
    //初始化
    public LogicalRegressionModel() {
        for(int i=0; i<61; i++)
            //array_w[i] = random() * 100;
            array_w[i] = 0;
    }

    //预测函数 求值
    int getResult(double[] array_x){
        double h = 0.0;
        double g = 0.0;
        int result = 0;
        for(int i=0; i<array_w.length; i++) {
            if(i == 0)
                h += array_w[i];
            else
                h += array_w[i] * array_x[i-1];
        }
        g = 1 / (1 + Math.exp(-h));
        if(g >= 0.5)
            result = 1;
        else result = 0;
        return result;
    }


    //参数更新 批量梯度下降
    void updateW(double[][] data){
        int numOfX = data.length;
        double[] array_x_sum = new double[numOfColumn];//用于保存每列x求和的数组
        for(int i=0; i<array_x_sum.length; i++)//初始化
            array_x_sum[i] = 0;

        double[] array_X = new double[numOfColumn];
        double[] Array_X = new double[numOfColumn-1];
        for(int i=0; i<numOfX; i++) {
            //第i行x值数组
            for(int z=0; z<numOfColumn; z++)
                array_X[z] = data[i][z];
            System.arraycopy(array_X, 0, Array_X, 0, numOfColumn-1);
            for(int j=0; j<numOfColumn; j++) {
                if(j == 0)
                    array_x_sum[j] = getResult(Array_X) - array_X[numOfColumn - 1] ;
                else {
                    array_x_sum[j] += (getResult(Array_X) - array_X[numOfColumn - 1]) * array_X[j - 1];
                    //System.out.println(array_x_sum[j] + " " + getResult(Array_X) + " " + array_X[numOfColumn - 1] + " " + array_X[j - 1]);
                }
            }
        }

        for(int i=0; i<numOfColumn; i++) {
            array_w[i] -= array_x_sum[i] * a / numOfX;
            //System.out.println(array_x_sum[i] * a / numOfX);
        }
        //System.out.println();
    }


    //计算准确率
    public double getAccuracy(double[][] data){
        double numOfT = 0.0;
        double[] array_X = new double[numOfColumn];

        for(int i=0; i<data.length; i++){
            for(int z=0; z<numOfColumn; z++)
                array_X[z] = data[i][z];
            if(getResult(array_X) == array_X[numOfColumn - 1])
                numOfT++;
        }
        double acc = numOfT / data.length;
        System.out.println("the accuracy is " + acc);
        return acc;
    }

    //训练
    public void train(int r, int batch_size, double[][] data){
        System.out.println("start training......");
        int index = 0;
        for(int i=0; i<r; i++){
            System.out.println("round " + (i+1));
            if(index + batch_size >= data.length){
                double[][] DATA = new double[data.length - index][numOfColumn];
                for(int j =index; j<data.length; j++)
                    System.arraycopy(data[j], 0, DATA[j-index], 0, 62);
                updateW(DATA);
                getAccuracy(DATA);
            }
            else{
                double[][] DATA = new double[batch_size][numOfColumn];
                for(int j =index; j<index+batch_size; j++)
                    System.arraycopy(data[j], 0, DATA[j-index], 0, 62);
                updateW(DATA);
                getAccuracy(DATA);
                index += batch_size;
            }
        }
    }
}
