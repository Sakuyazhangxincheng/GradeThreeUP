#include<iostream>
#include<vector>
using namespace std;
int main()
{
	int times;
	cout << "������μӱ����Ĵ�����" << endl;
	cin >> times;

	double grade;
	vector<double> grades;
	cout << "����������ɼ���" << endl;
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

	cout << "�μӵĴ����� " << times << " ƽ���ɼ��� " << avg << endl;
}