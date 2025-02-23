//Program to calculate the area of triangle
#include<stdio.h>
#include<math.h>
void main()
{
	float a,b,c,s,area;
	printf("Enter the three Sides of Triangle:- \n");
	scanf("%f %f %f",&a,&b,&c);
	s=(a+b+c)/2;
	area=sqrt(s*(s-a)*(s-b)*(s-c));
	printf("The Area of Triangle is %.2f ",area);
	getch();
}
