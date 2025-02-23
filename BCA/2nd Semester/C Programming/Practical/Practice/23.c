//No Return type and Argument
#include<stdio.h>
void sum(int a, int b)
{
	int c;
	c=a+b;
	printf("Sum = %d",c);
}
void main()
{
	int x,y;
	printf("Enter the Two Number:- \n");
	scanf("%d%d",&x,&y);
	sum(x,y);
	getch();
}
