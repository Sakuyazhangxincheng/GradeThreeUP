#pragma once
#include "TableTennisPlayer.h"
class RatedPlayer : public TableTennisPlayer//RP
{
private:
    unsigned int rating;

public:
    RatedPlayer(unsigned int r = 0, const string& fn = "none",
        const string& ln = "none", bool ht = false);
    RatedPlayer(unsigned int r, const TableTennisPlayer& tp);
    unsigned int Rating() const { return rating; }
    void ResetRating(unsigned int r) { rating = r; }
    ~RatedPlayer();
    void Name() const;//重写父类函数 overriding
    void Name(int time) const;//重载函数 overloading
    
};
