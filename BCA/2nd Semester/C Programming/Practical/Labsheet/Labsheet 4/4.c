// WAP to read a number and display the multiplication table of that number.
#include<stdio.h>
void main()
{
	int i,n;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	printf("The Multiplication Table of %d.\n",n);
	for(i=1;i<=10;i++)
	{
		printf("%d x %d = %d\n",n,i,n*i);
	}
	getch();
}
