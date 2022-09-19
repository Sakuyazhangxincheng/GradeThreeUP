import numpy as np
import matplotlib.pyplot as plt
from itertools import compress
from sklearn.feature_selection import SelectKBest, f_regression

import pickle as pk
def save(DT):
    pk.dump(DT,open("Boston2.dat","wb"))

def read():
    load = pk.load(open("Boston2.dat","rb"))
    return load

def load_data():
    firstdata = np.fromfile('housing.data', sep=' ')
    feature_names = ['CRIM', 'ZN', 'INDUS', 'CHAS', 'NOX', 'RM', 'AGE', 'DIS', 'RAD', 'TAX', 'PTRATIO', 'B', 'LSTAT','PRICE']
    feature_num = len(feature_names)

    seconddata = firstdata.reshape([firstdata.shape[0] // feature_num, feature_num]) # 构造506*14的二维数组

    x = seconddata[:, :13]
    y = seconddata[:, 13]
    best = SelectKBest(f_regression, k=3)  # 根据回归结果，选择最好的三个特征
    best_x = best.fit_transform(x, y)  # 拟合数据得到结果
    print("各个特征相关性：\n", best_x)
    best_index = best.get_support()
    print("特征是否呗选中", best_index)
    best_features = list(compress(feature_names, best_index))
    print("选出的特征：", best_features, "\n")


    data=y
    for i in range(13):
        if best_index[i]==True :
            data = np.column_stack((x[:,i],data))
    feature_num=4

    maximums = data.max(axis=0)
    minimums = data.min(axis=0)
    avgs = data.sum(axis=0)/data.shape[0]

    for i in range(feature_num):
        data[:, i] = (data[:, i] - avgs[i]) / (maximums[i] - minimums[i]) #归一化处理 处理后的值位于[-0.5，0。5]之间

    ratio = 0.8
    offset = int(data.shape[0] * ratio)
    training_data = data[:offset]
    test_data = data[offset:]
    return training_data, test_data

class model(object):
    def __init__(self, num_of_weights):
        np.random.seed(0)
        self.w = np.random.randn(num_of_weights, 1) # 随机产生w的初始值
        self.b = 0.

    def forward(self, x):
        z = np.dot(x, self.w) + self.b #向量点积和矩阵乘法
        return z

    def loss(self, z, y):
        cost = (z -y) * (z - y)
        num_samples = y.shape[0]
        cost = np.sum(cost) / num_samples  # 均方误差
        return cost

    def gradient(self, x, y):
        z = self.forward(x)
        gradient_w = (z - y) * x
        gradient_w = np.mean(gradient_w, axis=0)
        gradient_w = gradient_w[:, np.newaxis]
        gradient_b = (z - y)
        gradient_b = np.mean(gradient_b)
        return gradient_w, gradient_b


    def update(self, gradient_w, gradient_b, eta=0.01):
        # 更新参数
        self.w = self.w - eta * gradient_w
        self.b = self.b - eta * gradient_b

    # 迭代500次，每次移动0.01
    def train(self, x, y, iterations=500, eta=0.01):
        losses = []
        print("训练结果：")
        for i in range(iterations):
            z = self.forward(x)
            L = self.loss(z, y)
            gradient_w, gradient_b = self.gradient(x, y)
            self.update(gradient_w, gradient_b, eta)
            losses.append(L)
            print('iter {}, loss{}'.format(i, L))
        return losses

# net = read()
# 获取数据
training_data, test_data = load_data()
# 取训练集全部行的前13列
x = training_data[:, :-1]
# 取训练集全部行的最后一列
y = training_data[:, -1:]
# 创建网络
net = model(3)
num_iterations = 2000
losses = net.train(x, y, iterations=num_iterations, eta=0.01)
save(net)