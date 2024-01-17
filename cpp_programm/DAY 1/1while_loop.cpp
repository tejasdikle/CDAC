#include<iostream>
int main()
{
    int n;
    std :: cout << "Enter the number:";
    std :: cin >> n;
    while (n>0)
    {
        std :: cout << n << std :: endl;
        --n;
    }
}