#include<iostream>
using namespace std;
int main()
{
	double literOfEuropean;
	const double kiloOfLiter=100;
	const double mildOfKilo = 62.14/100;
	const double gallonOfMile = 1;
	const double literOfGallon = 3.785;
	
	cout << "������Ӣʽ����������(ÿ100����)" << endl;
	cin >> literOfEuropean;
	cout << "��ʽ��Ӣ��/���أ���" << kiloOfLiter *mildOfKilo * literOfGallon / literOfEuropean << endl;
	return 0;


}