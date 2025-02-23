//WAP to calculate factorial of Positive Number only.
#include<stdio.h>
void main()
{
	int n,i,f=1;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	if(n>0)
	{
	for(i=1;i<=n;i++)
		f=f*i;
		printf("The Factorial of %d is %d.",n,f);
	}
	else
	printf("Invalid Input");
		getch();
	}
