//WAP to input the number and find the sum of each digits of number
#include<stdio.h>
void main()
{
	int n,sum=0;
	printf("Enter the Numer:- ");
	scanf("%d",&n);
	while(n!=0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	printf("Sum = %d",sum);
	getch();
}
