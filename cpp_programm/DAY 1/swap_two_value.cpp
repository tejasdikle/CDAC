#include<iostream>
int main()
{
    int a,b,temp;
    std :: cout << "Enter first number :";
    std :: cin >> a;

    std :: cout << "Enter second number :";
    std :: cin >> b;

    temp = a;   //
    a = b;
    b=temp;

    std :: cout << " swap number "<< a << " "<< b;

}