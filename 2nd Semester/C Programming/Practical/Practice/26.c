//Return Type and Argument
#include<stdio.h>
int sum (int, int);
void main()
{
	int a,b,c;
	printf("Enter the Two Number:- \n");
	scanf("%d%d",&a,&b);
	c=sum(a,b);
	printf("Sum = %d",c);
	getch();
}
int sum(int x,int y)
{
	int z = x+y;
	return z;
}
