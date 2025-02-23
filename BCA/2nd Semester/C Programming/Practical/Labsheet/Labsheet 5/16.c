//WAP that use a function called factorial(). This function takes a no. as an argument and returns the factorial value of that no
#include<stdio.h>
int factorial(int n)
{
	int i,fact = 1;
	for(i=1;i<=n;i++)
		fact = fact * i;
	return fact;
}
void main()
{
	int n;
	printf("Enter the number for factorial:- ");
	scanf("%d",&n);
	printf("Result = %d", factorial(n));
	getch();
}
