#include "Car.h"
#include "SUV.h"
#include <iostream>
using namespace std;
int main(){
	SUV suv;
	Car &car_point = suv;
	car_point.PrintSpecs();
	car_point.show();
}