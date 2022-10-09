#include<iostream>
using namespace std;
int main()
{
	double literOfEuropean;
	const double kiloOfLiter=100;
	const double mildOfKilo = 62.14/100;
	const double gallonOfMile = 1;
	const double literOfGallon = 3.785;
	
	cout << "请输入英式汽油消耗量(每100公里)" << endl;
	cin >> literOfEuropean;
	cout << "美式（英里/加仑）：" << kiloOfLiter *mildOfKilo * literOfGallon / literOfEuropean << endl;
	return 0;


}