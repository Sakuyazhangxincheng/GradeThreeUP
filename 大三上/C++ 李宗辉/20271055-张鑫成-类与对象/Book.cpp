#include<iostream>
#include "Book.h"
Book::Book(string newName, int newNO) {
	name = newName;
	NO = newNO;
}
Book::~Book()
{
	cout << name << " has been lent out" << endl;
}
void Book::show()
{
	cout << "This book's name: " << name << endl;
	cout << "This book's NO: " << NO << endl;
}