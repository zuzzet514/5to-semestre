#include <iostream>
using namespace std;

int main() 
{
    int N, total,input,numeroActual;    

    cin>>N;

    cin>>input;

    int menor = input;
    total = input;

    for (int i = 1; i < N; i++)
    {
        cin>>input;
        total+=input;
        if (input < menor)
        {
            menor = input;
        }
        
        
    }

    cout<<total - menor;
    
    return 0;
}
