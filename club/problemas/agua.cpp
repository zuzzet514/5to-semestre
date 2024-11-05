#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int N;

    cin >> N;

    vector<int> botellas(N);

    for (int i = 0; i < botellas.size(); i++)
    {
        cin >> botellas[i];
    }
    
    cout << min_element();

    return 0;
}