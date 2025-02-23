//WAP that identifies whether the given number is odd or even.
#include<stdio.h>
void main()
{
	int num;
	printf("Enter the Number:- ");
	scanf("%d",&num);
	if(num%2==0)
	{
	printf("%d is an Even Number.",num);
	}
	else
	{
	printf("%d is a Odd Number.",num);
	}
	getch();
}
