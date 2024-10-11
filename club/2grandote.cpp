#include <iostream>
#include <vector>
#include <cmath>
#include <vector>


using namespace std;

int main()
{
    int n,sum;
    cin>> n;

    for (int i = 0; i <= n; i++)
    {
        sum+= pow(2,i);
    }

    cout << sum;
    




    return 0;
}