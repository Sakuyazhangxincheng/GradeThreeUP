#include<iostream>
#include "RatePlayer.h"
#include "TableTennisPlayer.h"
using namespace std;
int main() {
	TableTennisPlayer tableTennisPlayer("zxc","zzz",true);
	int rate = 3;
	RatedPlayer ratePlayer(rate,tableTennisPlayer);
	ratePlayer.Name();
	ratePlayer.TableTennisPlayer::Name();
	ratePlayer.Name(3);
}
