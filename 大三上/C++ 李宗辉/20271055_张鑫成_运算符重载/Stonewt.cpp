#include<iostream>
using namespace std;
class Stonewt {
private:
	int stone;
	double pounds;
public:
	Stonewt()  {}
	Stonewt(double newPounds) { pounds = newPounds; }
	void show() { cout << "pounds: " << pounds << endl; }
	bool operator< (Stonewt &stonewt);
	bool operator> (Stonewt& stonewt);
	bool operator<= (Stonewt& stonewt);
	bool operator>= (Stonewt& stonewt);
	bool operator== (Stonewt& stonewt);
	bool operator!= (Stonewt& stonewt);

	double getPounds() { return pounds; }
};

int main()
{
	Stonewt Stonewts[6];
	Stonewts[0] = 24;
	Stonewts[1] = 25;
	Stonewts[2] = 26;
	double pound;
	for (int i = 0; i < 3; i++)
	{
		cin >> pound;
		Stonewts[i + 3] = pound;
	}
	double max= Stonewts[0].getPounds(); double min = Stonewts[0].getPounds();int num = 0;;
	Stonewt stonewtCase = 11;
	for (int i = 0; i < 6; i++)
	{
		if (Stonewts[i].getPounds() >= max)
		{
			max = Stonewts[i].getPounds();
		}
		if (Stonewts[i].getPounds() <= min)
		{
			min = Stonewts[i].getPounds();
		}
		if (Stonewts[i].operator>=(stonewtCase))
		{
			num++;
		}
	}
	cout << "max: " << max << endl;
	cout << "min: " << min << endl; 
	cout << "The num of overing 11 : " << num << endl;
}

bool Stonewt::operator<(Stonewt &stonewt)
{
	if (pounds < stonewt.pounds) {
		return true;
	}
	else
		return false;
}
bool Stonewt::operator>(Stonewt& stonewt)
{
	if (pounds > stonewt.pounds) {
		return true;
	}
	else
		return false;
}
bool Stonewt::operator<=(Stonewt& stonewt)
{
	if (pounds <= stonewt.pounds) {
		return true;
	}
	else
		return false;
}
bool Stonewt::operator>=(Stonewt& stonewt)
{
	if (pounds >= stonewt.pounds) {
		return true;
	}
	else
		return false;
}
bool Stonewt::operator==(Stonewt& stonewt)
{
	if (pounds == stonewt.pounds) {
		return true;
	}
	else
		return false;
}
bool Stonewt::operator!=(Stonewt& stonewt)
{
	if (pounds != stonewt.pounds) {
		return true;
	}
	else
		return false;
}


