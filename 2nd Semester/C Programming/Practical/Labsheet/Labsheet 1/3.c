#include<stdio.h>
void main()
{
	float a,b; 
	printf("Enter the Two Number:- \n");
	scanf("%f %f",&a,&b);
	printf("The Entered Number are %.2f and %.2f .\nSum= %.2f \nDifference= %.2f \nProduct= %.2f \nDivison= %.2f",a,b,a+b,a-b,a*b,a/b);	
}
