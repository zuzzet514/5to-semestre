#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int N, k;

    cin >> N;

    vector<int> nums(N);

    for (int i = 0; i < N; i++)
    {
        cin >> nums[i];
    }

    cin >> k;

    for(int i: nums)
    {
        if (i%k==0)
        {
            cout << i << " "; 

        } else {
            cout << "X" << " ";
        }
    }
    

}
