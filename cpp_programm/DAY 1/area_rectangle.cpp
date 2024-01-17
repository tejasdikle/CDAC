#include <iostream>
int main()
{
    int length,breath,area;
    std :: cout << "Enter the length: ";
    std :: cin >> length;

    std :: cout << "Enter the breath: ";
    std :: cin >> breath;

    area = 0.5*length*breath;

    std :: cout <<  "Area of Rectangle " << area ;
    return 0;

}