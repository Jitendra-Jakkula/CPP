#include <iostream>
#include <limits>
#include <cstdio>
using namespace std;
int main(){
    string name = "jitendra jakkula";
    cout << name;
    cout << "\n enter the name: ";
    cin >> name;
    cout << name;
    cin.clear();
    cin.ignore(numeric_limits<streamsize>:: max(),'\n');
    cout<< "\nenter the name : " ;
    getline(cin,name);
    cout << name;
    return 0;
}