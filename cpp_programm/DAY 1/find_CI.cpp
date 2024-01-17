
#include <iostream>

using namespace std;

int main() {
    double principal, rate, time;
    int n;

  
    cout << "Enter the principal amount: ";
    cin >> principal;
    cout << "Enter the annual interest rate (%): ";
    cin >> rate;
    cout << "Enter the number of years: ";
    cin >> time;
    cout << "Enter the number of times interest is compounded per year: ";
    cin >> n;

    rate = rate / 100.0;

    double amount = principal;
    for (int i = 0; i < n * time; i++) 
    {
        amount *= (1 + rate / n);
    }

 
    double interest = amount - principal;

  
    cout << "Final amount after " << time << " years: " << amount << endl;
    cout << "Interest earned:" << interest << endl;

    return 0;
}
