#include<iostream>
using namespace std;
class StringBad
{
private:
	char* str; // pointer to string
	int len; // length of string
	static int num_strings; // number of objects
public:
	StringBad(const char* s); // constructor
	StringBad(); // default constructor
	~StringBad(); // destructor
	StringBad(const StringBad& st);
	StringBad& operator=(const StringBad& st);
	//friend std::ostream& operator<<(std::ostream& os, const StringBad& st); // friend function
};

int StringBad::num_strings = 0;
int main()
{
	StringBad st1;
	StringBad st2("ABC");
	StringBad st3(st2);
	StringBad st4;
	st4.operator=(st3);
}


StringBad::StringBad(const char* s) {
	len = strlen(s);
	str = new char[len + 1];
	strcpy(str, s);
	num_strings++;
	cout << "当前字符串对象的个数是:" << num_strings << endl;
}
StringBad::StringBad() {
	num_strings++;
	len = 0;
	str = new char[1];
	str[0] = '\0';
	cout << "当前字符串对象的个数是:" << num_strings << endl;
}
StringBad::~StringBad() {
	num_strings--;
	cout << str << "字符串被释放，当前字符串对象的个数是" << num_strings << endl;
	delete str;
}
StringBad::StringBad(const StringBad& st) {
	num_strings++;
	len = st.len;
	str = new char[len + 1];
	strcpy(str, st.str);
	cout << "当前字符串对象的个数是:" << num_strings << endl;
}

StringBad& StringBad::operator=(const StringBad& st)
{
	if (this == &st)
		return *this;
	delete[] str;
	len = st.len;
	str = new char[len + 1];
	std::strcpy(str, st.str);
	cout << "当前字符串对象的个数是:" << num_strings << endl;
	return *this;
}
