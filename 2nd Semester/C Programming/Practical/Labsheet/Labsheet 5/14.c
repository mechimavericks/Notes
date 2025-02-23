/*  WAP that use a function called isprime(). This function takes a no. as an argument and returns either 0 or
1. The function returns 1 if the given argument is prime otherwise 0.			*/
#include<stdio.h>
int isprime(int n)
{
	int i,a=0;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
			a++;
	}
	if(a>0)
		return 0;
	else 
		return 1;	
}
void main()
{
	int n;
	printf("Enter a Number:- ");
	scanf("%d",&n);
	if(isprime(n)==1)
		printf("Prime Number.");
	if(isprime(n)==0)
		printf("Not Prime Number.");
	getch();	
}
