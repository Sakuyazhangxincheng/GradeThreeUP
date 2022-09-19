import numpy as np
import pickle as pk

def save(DT):
    pk.dump(DT,open("Boston.dat","wb"))

def read():
    load = pk.load(open("Boston.dat","rb"))
    return load


def load_data():
    firstdata = np.fromfile('housing.data', sep=' ')
    #firstdata = firstdata[~np.isnan(firstdata).any(axis=1)] # 缺失值
    feature_names = ['CRIM', 'ZN', 'INDUS', 'CHAS', 'NOX', 'RM', 'AGE', 'DIS', 'RAD', 'TAX', 'PTRATIO', 'B', 'LSTAT','PRICE']
    feature_num = len(feature_names)

    data = firstdata.reshape([firstdata.shape[0] // feature_num, feature_num]) # 构造506*14的二维数组

    maximums = data.max(axis=0)
    minimums = data.min(axis=0)
    avgs = data.sum(axis=0)/data.shape[0]
    print(maximums,"\n",minimums,"\n",avgs)

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
        # 计算w梯度，得到一个13维向量，每个分量分别代表该维度的梯度
        gradient_w = (z - y) * x
        # axis 不设置值，对 m*n 个数求均值，返回一个实数
        # axis = 0：压缩行，对各列求均值，返回 1* n 矩阵
        # axis =1 ：压缩列，对各行求均值，返回 m *1 矩阵
        gradient_w = np.mean(gradient_w, axis=0)
        # 增加维度，变成 n * 1 的矩阵
        gradient_w = gradient_w[:, np.newaxis]
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

    # 迭代500次，每次移动0.01
    def train(self, x, y, iterations=500, eta=0.01):
        losses = []
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
net = model(13)
num_iterations = 2000
losses = net.train(x, y, iterations=num_iterations, eta=0.01)
save(net)





