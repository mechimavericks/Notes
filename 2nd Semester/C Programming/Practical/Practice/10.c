//WAP to calculate x^n where x is base value and n is exponential value.
#include<stdio.h>
void main()
{
	int x,n,i,p=1;
	printf("Enter the Base and Exponential value:- ");
	scanf("%d %d",&x,&n);
	for(i=1;i<=n;i++)
		p=p*x;
		printf("The result is %d.",p);	
		getch();
	}
