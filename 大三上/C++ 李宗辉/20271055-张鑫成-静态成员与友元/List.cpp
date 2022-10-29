#include "List.h"
#include<iostream>
using namespace std;
List::List() {
	static int nums = 0;
	nums++;
	cout << nums << endl;
}
int List::addItem(int item) {
	if (!isFull()) {
		if (field[0] == '\0')
		{
			field[0] = item;
			return 1;
		}
		for (int i = 0; i < sizeof(field) / sizeof(int); i++) {
			if (field[i] == '\0')
			{
				field[i] = item;
				return 1;
			}
		}
	}
	else
		return 0;
}
int List::isEmpty() {
	if (field[0] == '\0')
	{
		return 1;
	}
	else
		return 0;
}
int List::isFull() {
	if (field[0] == '\0')
	{
		return 0;
	}
	for (int i = 0; i < sizeof(field) / sizeof(int); i++) {
		if (field[i] == '\0')
		{
			return 0;
		}
	}
	return 1;
}
void List::show() {
	for (int i = 0; i < sizeof(field) / sizeof(int); i++) {
		cout <<"第"<<i+1<<"个field的值： "<< field[i] << endl;
	}
}