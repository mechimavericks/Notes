//WAP to input the coefficient of simultaneous equation and find the values of x, y. 
//a1x+b1y+c1=0, a2x+b2y+c2=0 ,
//x=(b2*c1-b1*c2)/(b2*a1-a2*b1) and y=(c2*a1-c1*a2)/(b2*a1-a2*b1).
#include<stdio.h>
void main()
{
	int a1,b1,c1,a2,b2,c2,x,y;
	printf("Enter the Coefficient of First Equation(a,b,c):-\n");
	scanf("%d%d%d",&a1,&b1,&c1);
	printf("Enter the Coefficient of Second Equation(a,b,c):-\n");
	scanf("%d%d%d",&a2,&b2,&c2);
	x=(b1*c1-b1*c2)/(b2*a1-a2*b1);
	y=(c2*a1-c1*a2)/(b2*a1-a2*b1);
	printf("The Vaue of X=%d and Y=%d",x,y);
	getch();
}
