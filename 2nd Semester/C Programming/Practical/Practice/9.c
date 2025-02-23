//WAP to calculate table of user input.
#include<stdio.h>
void main()
{
	int n,i;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	printf("The Multiple Table of %d is\n",n);
	for(i=1;i<=10;i++)
		printf("%d x %d = %d\n",n,i,n*i);	
		getch();
	}
