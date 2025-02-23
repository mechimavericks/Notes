//WAP to Input the number and find the sum of the Number. 
#include<stdio.h>
void main()
{
	int n,a,b,sum;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	b=n;
	do
	{
		a=n%10;
		sum=sum+ a;
		n=n/10;
	}while(n!=0);
	printf("The Sum of %d is %d.",b,sum);
}
