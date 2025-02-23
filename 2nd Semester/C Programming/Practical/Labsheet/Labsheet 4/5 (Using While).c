// WAP that reads two numbers x and y from user and calculates the value of x to the power y. (while loop, for loop)
#include<stdio.h>
void main()
{
	int i=1,x,y,n=1;
	printf("Enter the base and Power value:- \n");
	scanf("%d%d",&x,&y);
	while(i<=y)
	{
		n=n*x;
		i++;
	}
	printf("The Output = %d",n);
	getch();
}
