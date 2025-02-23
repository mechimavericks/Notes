#include<stdio.h>
void main()
{
	float r,h,a;
	printf("Enter the Radius and Height of the Cylinder:- \n");
	scanf("%f %f",&r,&h);
	a=2*3.14*r*(r+h);
	printf("The Total Surface Area of Cylinder is %.2f.",a);
	getch();
}
