#include <iostream>

int main() 
{
    short minutos;
    
    std::cout << "Ingresa los minutos: ";
    std::cin >> minutos;

    std::cout << minutos << " son " << minutos*60;
}