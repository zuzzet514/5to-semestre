#include <iostream>
#include <vector>
#include <cmath>
#include <iomanip>


using namespace std;

int main()
{
    int a,b,c;

    cin >> a >> b >> c;

    if (a == b || c == b || c==a)
    {
        cout << "Si";
    } else
    {
        cout << "No";
    }
    

    return 0;
}