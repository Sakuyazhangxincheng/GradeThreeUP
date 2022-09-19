import warnings
warnings.filterwarnings('ignore')
from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

b_datas = datasets.load_boston()  # 加载数据集
x = b_datas.data  # 获取特征数据
y = b_datas.target  # 获取标签数据
x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2)  # 划分训练集和测试集

lr = LinearRegression()  # 创建线性回归模型
lr.fit(x_train, y_train)  # 拟合数据学习模型参数
y_test_predict = lr.predict(x_test)  # 预测测试数据结果

error_1 = mean_squared_error(y_test, y_test_predict)  # 计算测试误差
print("测试数据的均方误差：", error_1)  # 打印测试误差
y_train_predict = lr.predict(x_train)  # 预测训练集数据结果
error_2 = mean_squared_error(y_train, y_train_predict)  # 计算训练误差
print("训练数据的均xq", error_2)  # 打印训练误差