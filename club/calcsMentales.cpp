#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main() {
    float r,o1,o2,o3,o4;
    cin>>r;

    o1 = r + 5;
    o2 = o1*o1;
    o3 = o2 / (r/3);
    o4 = o3*o3*o3;

    cout << fixed << setprecision(6);
    cout << r << endl << o1 << endl <<o2<<endl<<o3<<endl<<o4;
       

    return 0;
}