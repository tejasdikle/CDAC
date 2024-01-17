#include<iostream>
using namespace std;

class Array
{
	int size;
	int *arr;
public:
	Array();
	Array(int);
	void Accept();
	void Display();
	int& operator[](int);
	~Array();
};

int& Array::operator[](int index)
{
	return arr[index];
}

Array::~Array()
{
	delete []arr;
}

void Array::Accept()
{
	cout<<"Enter array elements:"<<endl;
	for(int i=0; i<size; i++)
		cin>>arr[i];
}

void Array::Display()
{
	for(int i=0; i<size; i++)
		cout<<arr[i]<<"  ";
	cout<<endl;
}

Array::Array()
{
	size =5;
	arr=new int[size];
	for(int i=0; i<size; i++)
		arr[i]=0;
}

Array::Array(int s)
{
	size =s;
	arr=new int[size];
	for(int i=0; i<size; i++)
		arr[i]=0;
}



int main()
{
	Array a1(9);
	a1.Accept();  //9 8 7 6 5
	a1.Display();
	
	int x=a1[3]; //a1.operator[](3)
	cout<<"x="<<x<<endl;
	
	a1[3]=100;  //a1.operator[](3)=100;
	a1.Display();
	return 0;
}


