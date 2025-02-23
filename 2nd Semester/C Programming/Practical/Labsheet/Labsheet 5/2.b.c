/*   AP that calls a function called getarea(). This function is responsible for reading two integer numbers(length and breadth) and print the area of rectangle.
Argument and  return type.    */
#include<stdio.h>
int getarea(int l,int b)
{
	return l*b;
}
void main()
{
	int l,b,area;
	printf("Enter the Length and Breadth:- \n");
	scanf("%d%d",&l,&b);
	printf("The Area of Rectangle Having %d Length and %d Breadth is %d.",l,b,getarea(l,b));
	getch();
 } 
