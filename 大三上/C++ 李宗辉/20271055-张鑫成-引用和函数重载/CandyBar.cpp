#include<iostream>
using namespace std;
struct CandyBar
{
	const char* brand;
	double weight;
	int cal;
};

void show(CandyBar candyBar);
void change(CandyBar& candyBar, const char* brand = "Millennium Munch", double weight = 3.85, int cal = 350);
int main()
{
	CandyBar candyBar;
	char Brand[] = "Hello";
	const char* brand = Brand;
	double weight = 2.85;
	int cal = 321;
	change(candyBar);
	show(candyBar);
	change(candyBar, brand, weight, cal);
	show(candyBar);
}


void change(CandyBar &candyBar, const char* brand, double weight, int cal)
{
	candyBar.brand = brand;
	candyBar.weight = weight;
	candyBar.cal = cal;
}
void show(CandyBar candyBar)
{
	cout << "brand: " << candyBar.brand << endl << "weight: " << candyBar.weight << endl << "cal: " << candyBar.cal << endl<<endl;
}