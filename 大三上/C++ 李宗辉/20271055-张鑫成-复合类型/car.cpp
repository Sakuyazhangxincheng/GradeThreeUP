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
	vector<Car> *cars = new vector<Car>;
	Car car;
	
	for (int i = 0; i < times; i++) {
		cout << "�������" << i+1 << "������maker" << endl;
		cin.ignore();
		cin.getline(car.maker,50);
		cout << "�������" << i + 1 << "������buildyear" << endl;
		cin >> car.year;
		cars->push_back(car);
	}

	cout << "Here is your collection" << endl;
	for (int i = 0; i < times; i++) {
		cout <<"Car's maker: " << cars->at(i).maker<<endl << "Car's build year: " << cars->at(i).year << endl;
	}
}