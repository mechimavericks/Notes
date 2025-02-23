#include<stdio.h>
void main()
{
	float a,b;
	printf("Enter the Temperature in Fahrenheit:- ");
	scanf("%f",&a);
	b=(a-32)/180*100;
	printf("The Celsius of %f Fahrenheit is %f ",a,b);
}
