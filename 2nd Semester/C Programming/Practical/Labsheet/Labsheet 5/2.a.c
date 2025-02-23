/*  WAP that calls a function called getarea(). This function is responsible for reading two integer numbers(length and breadth) and print the area of rectangle.
a. Argument and no return type.     */
#include<stdio.h>
void getarea(int l , int b)
{
	int area;
	area = l*b;
	printf("The Area of Recatangle having %d length and %d Breadth is %d.",l,b,area);
}
void main()
{
	int l,b;
	printf("Enter the Length and breadth:- \n");
	scanf("%d%d",&l,&b);
	getarea (l,b);
	getch();
}
