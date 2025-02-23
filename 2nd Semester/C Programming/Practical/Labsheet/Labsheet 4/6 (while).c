//WAP that reads a number (n) from user and calculates the factorial of that number.(using while, for)
#include<stdio.h>
void main()
{
	int n,i,f=1;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	i=0;
	while(i<n)
	{
		f=f*(n-i);
		i++;
	}
	printf("The Factorial of %d is %d.",n,f);
	getch();
}
