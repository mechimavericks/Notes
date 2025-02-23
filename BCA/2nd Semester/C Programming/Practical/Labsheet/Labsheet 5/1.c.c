//WAP to read a number „n" and calculate its cube using function:
// c.Argument and  return type.
#include<stdio.h>
#include<math.h>
int cube(int n)
{
	int cube;
	cube = pow(n,3);
	return cube;
}
void main()
{
	int a,b;
	printf("Enter the Number:- ");
	scanf("%d",&a);
	b = cube (a);
	printf("Cube = %d",b);
	getch();
}
