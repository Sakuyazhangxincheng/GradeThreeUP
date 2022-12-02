#pragma once
#include <iostream>
using namespace std;
class Car
{
private:
    double weight;
public:
    Car() { weight = 555; };
    virtual ~Car();
    virtual void show() = 0;
    virtual void PrintSpecs() { cout << "Car"; };
};
