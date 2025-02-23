//WAP that calls a function named interest(). This function takes the values of principal, number of years and rate of interest as argument and returns the calculated interest.
#include<stdio.h>
int interest(int p, int r, int t)
{
	float i;
	i=p*t*r/100;
	return i;
}
void main()
{
	int p,r,t;
	float i;
	printf("Enter the Principal Amount, Rate of Intrest and Time:- \n");
	scanf("%d%d%d",&p,&r,&t);
	i=interest(p,r,t);
	printf("Interest = %.2f",i);
	getch();
}
