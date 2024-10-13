#include <iostream>
#include <vector>
#include <iomanip>
#include <cstdlib>
//#include <time>
#include <cmath>
#include "conio.h"

using namespace std;

int main() 
{


    int n;
    cin >> n;
    int linIzq=0;
    int linDer=n;
    string espacio = " ";
    string arroba = "@";

    for (int i = 1; i <= n; i++)
    {
        for (int i = 1; i <= n/2; i++)
        {
            cout << espacio;
        }
        
        cout << arroba;

        /*
        for (int j = n/2; j > 0; j--)
        {
            cout << espacio << espacio;
        }
        cout << arroba<<endl;
        */
        
    }
    

   
    
}