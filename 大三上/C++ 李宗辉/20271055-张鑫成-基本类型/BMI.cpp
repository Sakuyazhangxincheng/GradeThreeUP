#include<iostream>
using namespace std;
int main()
{
	double feet=0;
	double inch=0;
	double weight=0;
	const double inchOfFeet = 12;
	const double meterOfInch = 0.0254;
	const double kilogramsOfPounds = 2.2;
	double BMI;

	cout << "请输入身高英尺、英寸、体重" << endl;
	cin >> feet >> inch >> weight;
	inch += feet * inchOfFeet;
	BMI = (weight/kilogramsOfPounds) / (inch*meterOfInch * inch*meterOfInch);
	cout << "您的BMI为：" << BMI << endl;
	return 0;

}