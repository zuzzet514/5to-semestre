#include <iostream>
#include <vector>
// https://omegaup.com/arena/problem/La-moda-y-sus-signos/
using namespace std;

int main()
{
    int N;
    cin >> N;
    vector<int> n(N);

    for (int i = 0; i < N; i++)
    {
        cin>> n[i];
    }

    int dig, anotherCount;
   
    int currentCount = -1;

    for (int i = 0; i < N; i++)
    {
        anotherCount = 0;
        for (int j = 0; j < N; j++)
        {
            if(n[i]== n[j]) 
            {
                ++anotherCount;

            }

            
        }
        
    }
    
    


    return 0;
}