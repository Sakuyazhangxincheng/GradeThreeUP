#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	double tax=0;
	int tvarps=-1;
	while (1)
	{
		cout << "������׬ȡ�Ĺ��ʣ�" << endl;
		tvarps = -1;
		cin >> tvarps;
		
		if (tvarps <= pow(2, 8 * sizeof(int) - 1) && tvarps >= 0 && !cin.fail())
		{
			tax = 0;
			if (tvarps >= 35000) {
				tax += (tvarps - 35000) * 0.2;
				tax += 20000 * 0.15;
				tax += 10000 * 0.1;
			}
			else if (tvarps >= 15000)
			{
				tax += (tvarps - 15000) * 0.15;
				tax += 10000 * 0.1;
			}
			else if (tvarps >= 15000)
			{
				tax += (tvarps - 10000) * 0.1;
			}
			cout << "˰�գ�" << tax << endl;
		}
		else
		{
			break;
		}
	}
}