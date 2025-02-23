//WAP to read a no. „n" and print its multiplication table using function(mul).
#include<stdio.h>
void mul(int n)
{
	int i;
	for(i=1;i<=10;i++)
		printf("%d x %d = %d\n",n,i,i*n);
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
