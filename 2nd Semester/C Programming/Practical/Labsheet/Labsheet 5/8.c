//WAP that calls a function named as area(). This function takes the radius of the circle and returns the area of the circle.
#include<stdio.h>
#include<math.h>
float area(int r)
{
	return 3.14*pow(r,2);
}
void main()
{
	int r;
	printf("Enter the Radius of Circle:- ");
	scanf("%d",&r);
	printf("Area = %.2f",area(r));
	getch();
}
