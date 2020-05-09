#include <iostream>
using namespace std;

int powe(int, int);

int main()
{
    int b, p, result;

    cout <<"Enter the value of a\n";
    cin >> b;

    cout <<"Enter the value of n\n";
    cin >> p;

    result = powe(b, p);
    cout<<"The value of "<<b<<" power "<<p<<" is "<<result;

    return 0;
}

int powe(int b, int p)
{
    if (p != 0)
        return (b* powe(b, p-1));
    else
        return 1;
}