//WAP to find the sum of given non-negative integer using a recursive function.
#include<stdio.h>
int sum (int n)
{
	if(n==0)
		return 0;
	else
		return n+sum(n-1);
}
void main()
{
	int num;
	printf("Enter the Number:- ");
	scanf("%d",&num);
	printf("Sum = %d",sum(num));
	getch();
}
