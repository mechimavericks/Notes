//WAP to read total no. of seconds and print it in hours, minutes and second
#include<stdio.h>
void main()
{
	int a,h,s,m;
	printf("Enter the Total Seconds:- ");
	scanf("%d",&a);
	h=a/3600;
	a=a%3600;
	m=a/60;
	s=a%60;
	printf("Hours = %d \nMinutes = %d \nSeconds = %d",h,m,s);
	getch();
}
