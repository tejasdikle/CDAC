#include<iostream>
using namespace std;
/* If a function is returning a value by reference then,
   function call can stand onto the LHS of assignemnt operator.
*/

char& fn(char *str)
{
	return str[0];
}

int main()
{
	char s[20]="tcs";
	
	char ch='T';
	
	//ch=fn(s);
	fn(s)=ch;     //Tcs
	
	cout<<s<<endl;
}
