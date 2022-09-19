import warnings
warnings.filterwarnings('ignore')

from sklearn import datasets
from sklearn.preprocessing import StandardScaler
from sklearn.feature_selection import SelectKBest
from sklearn.feature_selection import f_regression
from sklearn.model_selection import train_test_split
from sklearn.linear_model import LinearRegression
from sklearn.metrics import mean_squared_error

house = datasets.load_boston()  # 加载数据
x = house.data  # 获取特征数据
y = house.target  # 目标房价信息
stand = StandardScaler()  # 创建标准化对象
stand_x = stand.fit_transform(x)  # 对特征数据进行标准化处理
best = SelectKBest(f_regression, k=3)  # 根据回归结果，选择最好的三个特征
best_x = best.fit_transform(stand_x, y)  # 拟合数据得到结果
print("各个特征相关性：\n",best_x)  # 打印结果
best_index = best.get_support()  # 特征是否选中，布尔类型列表
print("特征是否呗选中",best_index)
best_features = house.feature_names[best_index]  # 获取特征名称
print("选出的特征：",best_features,"\n")  # 打印特征名称


#选取特征之后 进行模型训练
train_x, test_x, train_y, test_y = train_test_split(best_x, y, test_size=0.2) #划分训练集测试集
lr = LinearRegression()
lr.fit(train_x, train_y) # 拟合数据学习模型参数
predict_y = lr.predict(test_x) # 预测测试数据结果
error_1 = mean_squared_error(test_y, predict_y) # 计算测试误差 （均方误差）
print("预测均方误差为：", error_1)
train_predict_y = lr.predict(train_x)
error_2 = mean_squared_error(train_y, train_predict_y)  # 训练误差
print("训练数据的均方误差：", error_2)
