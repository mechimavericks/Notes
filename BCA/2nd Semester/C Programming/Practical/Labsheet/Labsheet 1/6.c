#include<stdio.h>
void main()
{
	float a,c,r;
	printf("Enter Radius of a Circle:- ");
	scanf("%f",&r);
	c=2*3.143*r;
	a=3.143*r*r;
	printf("The Circle having %.2f Radius has Circumference= %.2f and Area= %.2f",r,c,a);
}
