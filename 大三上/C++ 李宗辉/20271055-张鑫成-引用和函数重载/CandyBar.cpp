#include<iostream>
using namespace std;
struct CandyBar
{
	string brand = "Millennium Munch";
	double weight = 2.85;
	int cal = 350;
};

void show(CandyBar candyBar);
CandyBar change(CandyBar candyBar, char* brand, double weight, int cal);
int main()
{
	CandyBar candyBar;
	char Brand[] = "Hello";
	char* brand = Brand;
	double weight = 3.85;
	int cal = 123;
	candyBar = change(candyBar, brand, weight, cal);
	show(candyBar);
}


CandyBar change(CandyBar candyBar, char* brand, double weight, int cal)
{
	candyBar.brand = brand;
	candyBar.weight = weight;
	candyBar.cal = cal;
	return candyBar;
}
void show(CandyBar candyBar)
{
	cout << "brand: " << candyBar.brand << endl << "weight: " << candyBar.weight << endl << "cal: " << candyBar.cal << endl;
}