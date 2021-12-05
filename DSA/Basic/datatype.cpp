#include <iostream>
using namespace std;

int main()
{
    int a;
    cout << "size of int " << sizeof(a) << " byte" << endl;

    float b;
    cout << "size of float " << sizeof(b) << " byte" << endl;

    double c;
    cout << "size of double " << sizeof(c) << " byte" << endl;

    char d;
    cout << "size of char " << sizeof(d) << " byte" << endl;

    int e;
    cout << "size of bool " << sizeof(e) << " byte" << endl;

    //using modifiers
    signed int sni;   //for int with sign
    unsigned int usi; //for int with no sign
    short int si;     //for int with short value
    long int li;

    return 0;
}