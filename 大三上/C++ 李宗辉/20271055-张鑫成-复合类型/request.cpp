#include<iostream>
using namespace std;
int main()
{
	const int nameSize = 20;
	cout << "What is your first name? ";
	char firstName[nameSize];
	cin.getline(firstName, nameSize);
	cout << "What is your last name? ";
	char lastName[nameSize];
	cin.getline(lastName, nameSize);
	cout << "What letter grade do you deserve?  ";
	char grade;
	cin >> grade;
	grade++;
	cout << "What is your age?  ";
	int age;
	cin >> age;
	cout << "Name:" << firstName << "," << lastName << endl;
	cout << "Grade:" << grade << endl;
	cout << "Age:" << age << endl;
}