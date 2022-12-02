#include "RatePlayer.h"
#include <iostream>

RatedPlayer::RatedPlayer(unsigned int r, const string& fn, const string& ln, bool ht) : TableTennisPlayer(fn, ln, ht)
{
	cout << "RatePlayer " << getFirstName() << " " << getLastName() <<"被构造了"<<endl;
	rating = r;
}

RatedPlayer::RatedPlayer(unsigned int r, const TableTennisPlayer& tp) : TableTennisPlayer(tp)
{
	cout << "RatePlayer " << getFirstName() << " " << getLastName() << "被构造了" << endl;
	rating = r;
}

RatedPlayer::~RatedPlayer()
{
	cout << "RatePlayer " << getFirstName() << " " << getLastName() << "被释放了" << endl;
}

void RatedPlayer::Name() const
{
	cout << "RatePlayer's name:" << getFirstName() << " " << getLastName() << endl;
}

void RatedPlayer::Name(int time) const
{
	for(int i=0;i<time;i++)
	cout << "RatePlayer's name:" << getFirstName() << " " << getLastName() << endl;
}
