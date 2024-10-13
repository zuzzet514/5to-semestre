#include <iostream>
#include <vector>
#include <iomanip>
#include <cstdlib>
// #include <time>
#include <cmath>

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
    int mayor;
    int menor;
    


    // count edades
    int alumnosEdad = -1, edadCount;

    for (int i = 0; i < n; i++)
    {
        edadCount = 0;
        if (alumnosEdad == alumnos[i])
        {
            continue;
        }

        for (int j = 0; j < n; j++)
        {
            if (alumnos[i] == alumnos[j])
            {
                edadCount++;
                alumnosEdad = alumnos[i];
            }
        }
        cout << alumnosEdad << " " << edadCount << endl;
    }
}