//Program to calculate compound interest.
#include<stdio.h>
#include<math.h>
void main()
{
	float p,r,n,c;
	printf("Enter the Principle Amount, Rate of Interest and Years:- \n");
	scanf("%f %f %f",&p,&r,&n);
	c=p*(pow((1+r/100),n)-1);
	printf("The compound Interest is %.2f",c);
	getch();
}
