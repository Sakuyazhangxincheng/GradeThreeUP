#pragma once
#include<iostream>
using namespace std;
class Book {
public:
	string name;
	int NO;
	void show();
	Book(string newName, int newNO);
	~Book();
};