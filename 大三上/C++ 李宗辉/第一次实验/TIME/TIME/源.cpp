#include<iostream>
using namespace std;
int main()
{
	long long second;
	const long minOfSecond = 60;
	const long hourOfSecond = 60 * 60;
	const long dayOfSecond = 24 * 60 * 60;
	cout << "������������" << endl;
	cin >> second;
	long day = second / dayOfSecond;
	long hour = (second - day * dayOfSecond) / hourOfSecond;
	long min = (second - day * dayOfSecond - hour * hourOfSecond) / minOfSecond;
	long seconds = (second - day * dayOfSecond - hour * hourOfSecond - min * minOfSecond);
	cout << "��Ӧ������" << day << "  ��ӦСʱ��" << hour<< "  ��Ӧ��������" << min <<"��Ӧ������"<< seconds << endl;
	return 0;
}