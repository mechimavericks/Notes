//WAP to calculate factorial of Given Number from user.
#include<stdio.h>
void main()
{
	int n,i,f=1;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		f=f*i;
		printf("The Factorial of %d is %d.",n,f);	
		getch();
	}
