#include <iostream>
using namespace std;

int main()
{
    int choice;
    cout << "Select" << endl;
    cout << "1. Odd Even" << endl;
    cout << "2. Prime Number" << endl;
    cout << "3. Compare 3 values" << endl;
    cout << "Your Choice: ";
    cin >> choice;

    if (choice == 1)
    {
        int a;
        cout << "Enter value of a to check if even or odd" << endl;
        cin >> a;
        if ((a % 2) != 0)
        {
            cout << "Number " << a << " is a odd number" << endl;
        }
        else
        {
            cout << "Number " << a << " is a even number" << endl;
        }
    }
    else if (choice == 3)
    {
        int a, b, c;
        cout << "Enter 3 values to check which is greater" << endl;
        cin >> a >> b >> c;
        if (a > b)
        {
            if (a > c)
            {
                cout << "Number " << a << " is greater" << endl;
            }
            else
            {
                cout << "Number " << c << " is greater" << endl;
            }
        }
        else
        {
            if (b > c)
            {
                cout << "Number " << b << " is greater" << endl;
            }
            else
            {
                cout << "Number " << c << " is greater" << endl;
            }
        }
    }
    else
    {
        cout << "Invalid choice" << endl;
    }
    return 0;
}