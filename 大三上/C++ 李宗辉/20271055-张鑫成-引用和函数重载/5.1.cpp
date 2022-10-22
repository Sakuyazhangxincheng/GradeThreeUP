#include<iostream>
using namespace std;


void print(string str);
void print(string str,int argument);
int main()
{
	
	string str = "abcabc";
	print(str);
	print(str, 1);
	print(str, 2);
}

void print(string str)
{
	cout << str << endl;
}

void print(string str, int argument)
{
	static int times = 1;
	if (argument != 0)
	{
		for (int i = 0; i < times; i++)
		{
			cout << str << endl;
		}
		times++;
	}
	else
	{

	}
}