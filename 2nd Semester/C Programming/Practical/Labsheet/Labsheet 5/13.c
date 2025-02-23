//WAP that calls a function whose name is power(). This function takes two arguments(x and y) and returns the value of x to the power y.
#include<stdio.h>
#include<math.h>
int power(int x, int y)
{
	return pow(x,y);
}
void main()
{
	int x,y;
	printf("Enter the value of base and exponential :- \n");
	scanf("%d%d",&x,&y);
	printf("Result = %d",power(x,y));
	getch();
}

