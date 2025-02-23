#include<stdio.h>
#include<math.h>
void main()
{
	float a,b,c;
	printf("Enter any Two Number:- \n");
	scanf("%f %f",&a,&b);
	c=pow((a+b),3);
	printf("The Cube of %.2f(1st+2nd) is %.2f",a+b,c);
	getch();
}
