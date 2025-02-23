//slove the quadratic equation ax^2 + bx + c = 0. [Assume all roots are real only]
#include<stdio.h>
#include<math.h>
void main()
{
	float a,b,c,x1,x2;
	printf("Enter th Value of A , B and C:- \n");
	scanf("%f%f%f",&a,&b,&c);
	x1=(-b+sqrt(b*b-4*a*c))/(2*a);
	x2=(-b-sqrt(b*b-4*a*c))/(2*a);
	printf("The Solution is X= %.2f,%.2f",x1,x2);
	getch();

}
	
	
	
