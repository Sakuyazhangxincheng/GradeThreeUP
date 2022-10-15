#include<iostream>
using namespace  std;

struct Pizza {
	string name;
	double diameter;
	double weight;
	Pizza(string name, double diameter, double weight) {
		this->name = name;
		this->diameter = diameter;
		this->weight = weight;
	}
};
int main()
{
	Pizza *pizza = new Pizza("China Pizza", 24, 30);
	cout << "pizza's diamter: " << pizza->diameter << endl;
	cout << "pizza's name: " << pizza->name << endl;
	cout << "pizza's weight: " << pizza->weight << endl;
}