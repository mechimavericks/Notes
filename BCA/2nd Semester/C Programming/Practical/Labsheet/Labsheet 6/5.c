//WAP to print Fibonacci series.
#include<stdio.h>
void main()
{
	int a[50],i,n;
	printf("How Many term you like to print fibonacci Series:- ");
	scanf("%d",&n);
	a[0]= 0;
	a[1] = 1;
	printf("The Fibonacci Series:\n");
	printf("%d\t%d\t",a[0],a[1]);
	for(i=2;i<n;i++)
	{
		a[i] = a[i-1] + a[i-2];
		printf("%d\t",a[i]);
	}
	getch();
}
