import numpy as np
import pickle as pk
def save(DT):
    pk.dump(DT,open("Cancer.dat","wb"))

def read():
    load = pk.load(open("Cancer.dat","rb"))
    return load


def load_data():
    firstdata = np.genfromtxt("breast-cancer-wisconsin.data",delimiter=",")[1:, :]
    firstdata = firstdata[~np.isnan(firstdata).any(axis=1)] # 缺失值
    feature_names = ['Sample code number', 'Clump Thickness', 'Uniformity of Cell Size', 'Uniformity of Cell shape', 'Marginal Adhesion','Single Epithelial Cell Size', 'Bare Nuclei', 'Bland Chormatin', 'Normal Nucleoli', 'Mitoses', 'Class', ]

    feature_num = len(feature_names)

    data = firstdata

    maximums = data.max(axis=0)
    minimums = data.min(axis=0)
    avgs = data.sum(axis=0)/data.shape[0]
    print(maximums,"\n",minimums,"\n",avgs)

    for i in range(feature_num-1):
        data[:, i] = (data[:, i] - avgs[i]) / (maximums[i] - minimums[i]) #归一化处理 处理后的值位于[-0.5，0。5]之间

    ratio = 0.8
    offset = int(data.shape[0] * ratio)
    training_data = data[:offset]
    test_data = data[offset:]
    return training_data, test_data

def sigmoid(z):
    return 1 / (1 + np.exp(-z))

class model(object):
    def __init__(self, num_of_weights):
        np.random.seed(0)
        self.w = np.random.randn(num_of_weights, 1) # 随机产生w的初始值
        self.b = 0.


    def forward(self, x):
        z = np.dot(x, self.w) + self.b #向量点积和矩阵乘法
        return z

    def pre(self, x):
        probability = sigmoid(np.dot(x,self.w).T)
        list=[]

        for j in probability:
            for i in j.T:
                if i>=0.5:
                    list.append(4)
                else:
                    list.append(2)
        return list
       # return [2 if i >= 0.5 else 4 for i in probability ]

    def loss(self, x, y):  # 创建矩阵对象
        self.w = np.matrix(self.w)
        x = x.astype(np.float64)
        x = np.matrix(x)

        y = np.matrix(y)
        z = x*(self.w)


        first = np.multiply(-y, np.log( sigmoid(z) ))
        second = np.multiply((1 - y), np.log(1 - sigmoid(z) + 1e-5))
        return np.sum(first - second) / (len(x))

    def gradient(self, x, y):
        z = self.forward(x)
        # 计算w梯度
        z = z.A
        gradient_w = (z - y) * x
        # axis 不设置值，对 m*n 个数求均值，返回一个实数
        # axis = 0：压缩行，对各列求均值，返回 1* n 矩阵
        # axis =1 ：压缩列，对各行求均值，返回 m *1 矩阵
        gradient_w = np.mean(gradient_w, axis=0)
        # 增加维度，变成 n * 1 的矩阵
        #gradient_w = gradient_w[:, np.newaxis]
        # 计算b的梯度
        gradient_b = (z - y)
        gradient_b = np.mean(gradient_b)
        return gradient_w, gradient_b

# 确定损失函数更小的点
    # 更新梯度
    def update(self, gradient_w, gradient_b, eta=0.01):
        # 更新参数
        # 相减：参数需要向梯度的反方向移动。
        # eta：控制每次参数值沿着梯度反方向变动的大小，即每次移动的步长，又称为学习率。
        self.w = self.w - eta * gradient_w
        self.b = self.b - eta * gradient_b

    def train(self, x, y, iterations=125, eta=0.001):
        losses = []
        k=0
        K=0
        for i in range(iterations):
            L = self.loss(x, y)
            gradient_w, gradient_b = self.gradient(x, y)
            self.update(gradient_w, gradient_b, eta)
            losses.append(L)
        z = self.pre(x)
        for j in z:
            if K < 545:
                if z[K] == y[K]:
                    k = k + 1
                    K = K + 1
                else:
                    K = K + 1

        print("正确率:", k / K)


        return losses

# net = read()
training_data, test_data = load_data()

x = training_data[:, 1:-1]
# 取训练集全部行的最后一列
y = training_data[:, -1:]
# 创建网络
net = model(9)
num_iterations = 500
losses = net.train(x, y, iterations=num_iterations, eta=0.01)
save(net)