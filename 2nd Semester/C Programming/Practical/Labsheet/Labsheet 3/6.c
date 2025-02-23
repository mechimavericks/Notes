//6. WAP that reads a year from user and find if the year is a leap year. (Year%4)
#include<stdio.h>
void main()
{
	int year;
	printf("Enter the Year:- ");
	scanf("%d",&year);
	if(year%4==0)
		printf("%d is a Leap Year.",year);
	else
		printf("%d is not a Leap Year.",year);
getch();
}
