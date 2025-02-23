//WAP that reads a number (n) from user and calculates the factorial of that number.(using while, for)
#include<stdio.h>
void main()
{
	int i,n,f=1;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		f=f*(n-i);
	}
	printf("The factorial of %d is %d.",n,f);
	getch();
}
