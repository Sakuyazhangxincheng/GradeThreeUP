#include<iostream>
#include"List.h"
using namespace std;
void empty(List list);
void full(List list);
int main() {
	List list1;
	List list2;
	empty(list2);
	full(list2);

	list2.addItem(1);
	list2.addItem(123);

	empty(list2);
	full(list2);

	list2.addItem(4);
	list2.addItem(666);
	list2.addItem(999);

	empty(list2);
	full(list2);
	list2.show();
}

void empty(List list) {
	if (list.isEmpty()) {
		cout << "list is empty" << endl;
	}
	else
	{
		cout << "list is not empty" << endl;
	}
}
void full(List list) {
	if (list.isFull()) {
		cout << "list is full" << endl;
	}
	else
	{
		cout << "list is not full" << endl;
	}
}