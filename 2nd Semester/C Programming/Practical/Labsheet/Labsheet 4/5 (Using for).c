// WAP that reads two numbers x and y from user and calculates the value of x to the power y. (while loop, for loop)
#include<stdio.h>
void main()
{
	int i,x,y,n=1;
	printf("Enter the base and Power value:- \n");
	scanf("%d%d",&x,&y);
	for(i=1;i<=y;i++)
		n=n*x;
	printf("The Output = %d",n);
	getch();
}
