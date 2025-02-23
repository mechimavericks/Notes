#include<stdio.h>
void main()
{
	float l,b,a;
	printf("Enter the Length and Breadth of Rectangle:- \n");
	scanf("%f %f",&l,&b);
	a=l*b;
	printf("The Area of Rectangle having %.2f Length and %.2f Breadth is %.2f",l,b,a);
}
