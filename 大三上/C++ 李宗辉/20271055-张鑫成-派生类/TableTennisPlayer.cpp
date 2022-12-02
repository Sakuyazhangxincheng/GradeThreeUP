#include "TableTennisPlayer.h"
#include <iostream>

TableTennisPlayer::TableTennisPlayer(const string& fn, const string& ln, bool ht)
{
	firstname = fn;
	lastname = ln;
	hasTable = ht;
	cout << "TableTennisPlayer " << getFirstName() << " " << getLastName() << "被构造了" << endl;
}

void TableTennisPlayer::Name() const
{
	cout <<"TableTennisPlayer's name:" << firstname << " " << lastname << endl;
}

string TableTennisPlayer::getFirstName() const
{
	return firstname;
}

string TableTennisPlayer::getLastName() const
{
	return lastname;
}

TableTennisPlayer::~TableTennisPlayer()
{
	cout << "TableTennisPlaye " << getFirstName() << " " << getLastName() << "被释放了" << endl;
}
