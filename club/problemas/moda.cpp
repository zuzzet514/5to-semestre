#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int N;
    cin >> N;
    vector<int> n(N);

    for (int i = 0; i < N; i++)
    {
        cin >> n[i];
    }

    int dig, anotherCount = 0;

    int currentCount = -1;

    for (int i = 0; i < N; i++)
    {

        if (dig == abs(n[i]))
        {
            continue;
        }
        
        anotherCount = 0;
        for (int j = 0; j < N; j++)
        {
            if (abs(n[i]) == abs(n[j]))
            {
                ++anotherCount;
            }
        }
        
        
        if (currentCount < anotherCount)
        {
            currentCount = anotherCount;
            dig = abs(n[i]);
        }

        if (currentCount == anotherCount)
        {
            dig = abs(n[i]) < dig ? abs(n[i]) : dig;
        }
        
    }

    int negative = 0, positive = 0;

    for (int i : n)
    {
        if (abs(i) == dig)
        {
            if (i > 0)
            {
                positive++;
            }
            else
            {
                negative++;
            }
        }
    }

    cout << dig << endl
         << positive << " " << negative;

    return 0;
}