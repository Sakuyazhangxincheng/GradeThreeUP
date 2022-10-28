#include<iostream>
using namespace std;

void fuction(int a, int b = 1, int c = 0)
{
	cout << "start:" << endl;
	if (a > 0)
		cout << "a: " << a << endl;
	if (b > 0)
		cout << "b: " << b << endl;
	if (c > 0)
		cout << "c: " << c << endl;
	cout << "over" << endl << endl;
}
int main()
{
	fuction(3);
	fuction(3, 2, 1);
}