//WAP to pass structure to function using pointer.
#include<stdio.h>
void function(int *x, int *y)
{
	*x = *x+*y;
}
struct details
{
	int a,b;
	char name[25];
}d;
void main()
{
	int temp;
	printf("Enter the Name and Salary of Two Months:\n");
	scanf("%s%d%d",&d.name,&d.a,&d.b);	
	temp= d.a;
	function(&d.a,&d.b);
	printf("Name = %s\nFirst Months Salary = %d\nSecond Months Salary = %d\nTotal Salary = %d\n",d.name,temp,d.b,d.a);
	getch();
}
