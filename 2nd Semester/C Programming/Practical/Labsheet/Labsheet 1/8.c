#include<stdio.h>
void main()
{
	float p,t,r,si;
	printf("Enter the Principle Amount, No. of Years and Rate of Interest:- \n");
	scanf("%f %f %f",&p,&t,&r);
	si=p*t*r/100;
	printf("The Interest of %.2f Amount within %.2f Years by %.2f rate of Interest is %.2f",p,t,r,si);
	getch();
}
