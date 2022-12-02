#pragma once
#include <iostream>
using namespace std;
#include "Car.h"
class SUV : public Car
{
private:
    int color;
public:
    SUV();
    virtual ~SUV();
    virtual void PrintSpecs() { cout << "SUV"<<endl; };
    void RepaintSUV(int c) { color = c; };
    virtual void show();
};
