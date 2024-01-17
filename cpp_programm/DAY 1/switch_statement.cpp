#include <iostream>
int num1 ,num2 ,oper;
int main()
{
    
    
    std :: cout << " 1. Addition " << std :: endl;
    std :: cout << " 2. Substraction " << std :: endl;
    std :: cout << " 3. Multiplication " << std :: endl;
    std :: cout << " 4. Division ";
    std :: cout << " Which opration u want perform :" << std :: endl;
    std :: cout << " Enter the operation";
    std :: cin >> oper;
   
    switch(oper)
    {
    case 1:
        int  sum ;
        std :: cout << "Enter two number for addition :";
        std :: cin >> num1 >> num2;
        sum = num1 + num2;
        std :: cout << "Adition of "<< num1 << "+" <<num2 << "=" <<sum;
        break;
    case 2:
        int  sub ;
        std :: cout << "Enter two number for Substraction:";
        std :: cin >> num1 >> num2;
        sub = num1 - num2;
        std :: cout << "Adition of "<< num1 << "+" <<num2 << "=" <<sub;
        break;
    case 3:
        int mul ;
        std :: cout << "Enter two number for multipliction :";
        std :: cin >> num1 >> num2;
        mul = num1 * num2;
        std :: cout << "Adition of "<< num1 << "+" <<num2 << "=" <<mul;
        break;
    case 4:
       int  div ;
        std :: cout << "Enter two number for adivision :";
        std :: cin >> num1 >> num2;
        div = num1 / num2;
        std :: cout << "Adition of "<< num1 << "+" <<num2 << "=" <<div;
        break;
    }
    
    
    



}