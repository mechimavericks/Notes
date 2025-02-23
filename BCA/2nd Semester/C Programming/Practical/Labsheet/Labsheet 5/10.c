//WAP to read a no. „n" and print the sum of natural numbers from 1 to n using function.
#include<stdio.h>
int sum()
{
	int i,sum=0, n;
	printf("Enter the value of n:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		sum=sum+i;
	return sum;
}
void main()
{
	printf("Sum = %d",sum());
	getch();
}
