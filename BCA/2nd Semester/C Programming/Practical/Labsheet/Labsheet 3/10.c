// WAP to read three sides of triangle and check the validity of triangle, also decide the type of triangle. 
//(Isosceles, equilateral, right angle) [If a, b, c are sides of a triangle then, a+b>c or b+c>a or a+c>b ]
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter the three sides of triangle:- \n");
	scanf("%d%d%d",&a,&b,&c);
	if(a+b>c || b+c>a || a+c>b)
	{
		printf("The Triangle is valid and ");
		if(a==b && b==c)
			printf("Equilateral Triangle.");
		else if (a==b || b==c || a==c )
			printf("Isosceles Triangle.");
		else 
			printf("Right Angle Triangle.");
	}
	else
		printf("The Triangle is Invalid.");
	getch();
}
