#include<iostream>
int main()
{
    int num;

    do{
        std :: cout << "Enter the number :";
        std :: cin >> num;

        if (num==0)
        {
            std :: cout << "Your are enter in programm:"<<std :: endl;
        }
        else{
            std :: cout << "Enter out from programm"<<std :: endl;
        }
    }while(num!=0);
}