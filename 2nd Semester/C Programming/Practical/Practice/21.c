//Write a C program to find input number is prime or composite 
#include<stdio.h>
void main()
{
	int n,i,a,temp;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	a=0;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
			a++;
	}
	if(a>0)
		printf("Composite Number.");
	else
		printf("Prime Number.");
	getch();
}
