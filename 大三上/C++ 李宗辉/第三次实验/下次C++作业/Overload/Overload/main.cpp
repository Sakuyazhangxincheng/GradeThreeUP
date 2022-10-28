#include<iostream>
using namespace std;
void function(int a, int b, int c);
void function(int a, int b);
int main()
{
	function(3, 2, 0);
	function(-1, 2);
}


void function(int a, int b, int c)
{
	cout << "start" << endl;
	if (a > 0)
		cout <<"a: " << a << endl;
	if (b > 0)
		cout << "b: " << b << endl;
	if (c > 0)
		cout << "c: " << c << endl;
	cout << "over " << endl << endl;
}

void function(int a, int b)
{
	cout << "start" << endl;
	if (a > 0)
		cout << "a: " << a << endl;
	if (b > 0)
		cout << "b: " << b << endl;
	cout << "over " << endl << endl;
}