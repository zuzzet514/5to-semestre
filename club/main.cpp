#include <iostream>

int main()
{
    std::string name;
    int num;

    std::cout << "Ingresa un número: ";
    std::cin >> num;

    std::cout << "Ingresa tu nombre completo: ";

    getline(std::cin >> std::ws, name);
    std::cout << "Número: " << num << '\n';
    std::cout << "Nombre: " << name << '\n';
}