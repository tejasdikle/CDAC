#include <iostream>
int main()
{
    int num1 ,num2 ,num3;
    std :: cout << "Enter the number 1 :";
    std :: cin >> num1;

    std :: cout << "Enter the number 2 :";
    std :: cin >> num2;

    std :: cout << "Enter the number 3 :";
    std :: cin >> num3;

    if ((num1 > num2 ) && ( num1 > num3))
    {
        std :: cout << num1 << " Number is max";
    }
    else if ((num2 > num1 ) && ( num2 > num3))
    {
        std :: cout << num2 << " Number is max";
    }
    else 
    {
        std :: cout << num3 << " Number  is max";
    }
    return 0;
}