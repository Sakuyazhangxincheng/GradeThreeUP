import warnings

import numpy as np
from sklearn.datasets import load_breast_cancer
warnings.filterwarnings('ignore')
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression

cancer = load_breast_cancer()  # 加载数据集
x = cancer.data
y = cancer.target


x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2)  # 划分训练集和测试集

lr = LogisticRegression(solver='liblinear')  # 创建线性回归模型
lr.fit(x_train, y_train)  # 拟合数据学习模型参数
y_test_predict = lr.predict(x_test)  # 预测测试数据结果

train_score = lr.score(x_train, y_train)
test_score = lr.score(x_test, y_test)
print('训练准确率: {train_score:.6f}; 测试准确率: {test_score:.6f}'.format(
    train_score=train_score, test_score=test_score))

