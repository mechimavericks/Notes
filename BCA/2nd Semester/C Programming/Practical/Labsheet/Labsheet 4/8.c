// WAP to solve the quadratic equation.
#include<stdio.h>
#include<math.h>
void main()
{
	int a,b,c;
	float eq1,eq2;
	printf("Solving the Quadratic Equation.\n");
	printf("Enter the Value of a,b and c:- \n");
	scanf("%d%d%d",&a,&b,&c);
	eq1= (-b+sqrt(pow(b,2)-4*a*c))/(2*a);
	eq2= (-b-sqrt(pow(b,2)-4*a*c))/(2*a);
	printf("The Solution is X = %.2f , %.2f",eq1,eq2);
	getch();	
}
