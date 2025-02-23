//Return Type and No argument
#include<stdio.h>
int sum()
{
	int a,b,c;
	printf("Enter the Two Number:- \n");
	scanf("%d%d",&a,&b);
	c=a+b;
	return c;
}
void main()
{
	int a;
	a=sum();
	printf("Sum = %d",a);
	getch();
}
