//WAP to print “Hello” n times using recursive function.
#include<stdio.h>
int print(int n)
{
	printf("Hello\n");
	if(n==0)
		return  0;
	else
	{
		return print(n-1);
	}
}
void main()
{
	int n;
	printf("Enter How Many Times You Like to Print:- ");
	scanf("%d",&n);	
	printf("",print(n));
	getch();
}
