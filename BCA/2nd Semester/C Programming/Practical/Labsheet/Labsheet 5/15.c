//WAP that calls a function whose name is mul(). This function takes one argument(x) and prints the multiplication table of that no.
#include<stdio.h>
void mul(int x)
{
	int i;
	for(i=1;i<=10;i++)
		printf("%d x %d = %d\n",x,i,i*x);
}
void main()
{
	int n;
	printf("Enter the value of n:- ");
	scanf("%d",&n);
	printf("The Multiplication Table of %d\n",n);
	mul(n);
	getch();
}
