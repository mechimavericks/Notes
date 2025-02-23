//WAP to generate the Fibonacci series.[0 1 1 2 3 5 8………….]
#include<stdio.h>
void main()
{
	int n,a,b,c,i;
	printf("Enter the Number to generate the Fibonacci Series:- ");
	scanf("%d",&n);
	a=0; b=1;
	printf("%d\t%d\t",a,b);
	for(i=2;i<n;i++)
	{ 
		c=a+b;
		printf("%d\t",c);
		a=b;
		b=c;
	}
	getch();
}
