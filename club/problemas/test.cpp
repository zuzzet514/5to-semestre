#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int n;
    // poner ifs?
    cin >> n;

    vector<int> alumnos(n);

    for (int i = 0; i < n; i++)
    {
        cin >> alumnos[i];
    }

    // ordenando el arreglo
    vector<int> alumnosOrdenados(n);
    int mayor;
    int menor;

    for (int i = 0; i < n-1; i++)
    {
        for (int j = i; j < n-1; j++)
        {
            if (alumnos[j]>=alumnos[j+1])
            {
                menor= alumnos[j+1];
                mayor = alumnos[j];
            }
        }
        alumnos[i] = menor;
        alumnos[i+1] = mayor;
        
    }

    for(int i: alumnos)
    {
        cout << i;
    }


    return 0;
}