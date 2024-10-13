#include <iterator>
#include <iostream>

using namespace std;

int main()
{
/*
    int n[10];

    // valores random
    for (int i = 0; i < size(n); i++)
    {
        cout << n[i] << ' ';
    }

    int m[5] = {1, 2, 3};

    for (int i = 0; i < size(m); i++)
    {
        cout << m[i] << ' ';
    }

    cout <<"";
*/
    int mat[1000][1000], F,C,entrada;
    cin>>F >> C;

    for (int filas = 0; filas < F; filas++)
    {
        for (int columnas = 0; columnas < C; columnas++)
        {
            cin >> mat[filas][columnas];            
        }

        for (int fila = 0; fila < F; fila++)
        {
            for (int columna = 0; columna < C; columna++)
            {
                cout << mat[fila][columna] << ' ';
            }
            cout << endl; 
        }
        
        
    }
    
    


    return 0;
}