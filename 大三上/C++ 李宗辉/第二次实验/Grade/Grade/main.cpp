#include<iostream>
#include<vector>
using namespace std;
int main()
{
	int times;
	cout << "请输入参加比赛的次数：" << endl;
	cin >> times;

	double grade;
	vector<double> grades;
	cout << "请依次输入成绩：" << endl;
	for (int i = 0; i < times; i++)
	{
		cin >> grade;
		grades.push_back(grade);
	}

	double avg = 0;
	for (int i = 0; i < grades.size(); i++) {
		avg += grades[i];
	}

	avg /= grades.size();

	cout << "参加的次数： " << times << " 平均成绩： " << avg << endl;
}