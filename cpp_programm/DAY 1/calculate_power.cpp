#include <iostream>
int main ()
{
    int base ,exp , ans=1 ;
    std :: cout << "Enter the base and exponetial:";
    std :: cin >> base >> exp ;
    
    int i = 1;
    for ( i = 1 ; i <= exp ; ++i)
    {
        ans *=base;
    }
    std :: cout << ans ;
    return 0;

}