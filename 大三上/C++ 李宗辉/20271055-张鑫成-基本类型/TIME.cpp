#include<iostream>
using namespace std;
int main()
{
	long long second;
	const long minOfSecond = 60;
	const long hourOfSecond = 60 * 60;
	const long dayOfSecond = 24 * 60 * 60;
	cout << "请输入秒数：" << endl;
	cin >> second;
	long day = second / dayOfSecond;
	long hour = (second - day * dayOfSecond) / hourOfSecond;
	long min = (second - day * dayOfSecond - hour * hourOfSecond) / minOfSecond;
	long seconds = (second - day * dayOfSecond - hour * hourOfSecond - min * minOfSecond);
	cout << "对应天数：" << day << "  对应小时：" << hour<< "  对应分钟数：" << min <<"对应秒数："<< seconds << endl;
	return 0;
}