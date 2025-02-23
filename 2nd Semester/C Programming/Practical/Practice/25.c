//Return Type and Argument
#include<stdio.h>
int sum(int a,int b)
{
	int c;
	c=a+b;
	return c;
}
void main()
{
	int x,y,z;
	printf("Enter the Two Number:- \n");
	scanf("%d%d",&x,&y);
	z=sum(x,y);
	printf("Sum = %d",z);
	getch();
}
