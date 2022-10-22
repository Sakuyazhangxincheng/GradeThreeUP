#include<iostream>
#include<vector>
using namespace std;
struct Car {
	char maker[50];
	int year;
};
int main()
{
	int times;
	cout << "how many cars to catalog:" << endl;
	cin >> times;
	
	Car *cars = new Car[times];
	for (int i = 0; i < times; i++) {
		cout << "请输入第" << i+1 << "辆车的maker" << endl;
		cin.ignore();
		cin.getline(cars[i].maker, 50);
		cout << "请输入第" << i + 1 << "辆车的buildyear" << endl;
		cin >> cars[i].year;
	}

	cout << "Here is your collection" << endl;
	for (int i = 0; i < times; i++) {
		cout <<"Car's maker: " << cars[i].maker<<endl << "Car's build year: " << cars[i].year << endl;
	}
}