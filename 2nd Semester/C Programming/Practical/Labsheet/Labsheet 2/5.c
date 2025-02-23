 //WAP to read no. of days & print in terms of year, months & days.
#include<stdio.h>
void main()
{
	int days,y,m,a;
	printf("Enter the Days:- ");
	scanf("%d",&a);
	y=a/365;
	a=a%365;
	m=a/30;
	days=a%30;
	printf("Years = %d \nMonths = %d \nDays = %d",y,m,days);
	getch();
}
