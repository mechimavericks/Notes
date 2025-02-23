//Take a and b from user calculate a^b;
#include<stdio.h>
#include<math.h>
void main()
{
	float a,b,c;
	printf("Enter the two Number(a,b):- \n");
	scanf("%f %f",&a,&b);
	c=pow(a,b);
	printf("The calculation of Number %.2f and it's Power %.2f is %.2f",a,b,c);
	getch();
}
