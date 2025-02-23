//No return type and no argument
#include<stdio.h>
void sum()
{
	int a,b,c;
	printf("Enter the Two Number:- \n");
	scanf("%d%d",&a,&b);
	c=a+b;
	printf("Sum = %d",c);
}
void main()
{
	sum();
	getch();
}
