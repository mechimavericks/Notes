//WAP to find the factorial of the no. using recursive function
#include<stdio.h>
int factorial(int n)
{
	if(n==0)
		return 1;
	else 
		return n*factorial(n-1); 
}
void main()
{
	int n;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	printf("Factorial = %d",factorial (n));
	getch();
}
