//WAP to read a number „n" and calculate its cube using function:
// b.Argument and no return type.
#include<stdio.h>
#include<math.h>
void cube(int n)
{
	int cube;
	cube = pow(n,3);
	printf("Cube = %d",cube);
}
void main()
{
	int num;
	printf("Enter the Number:- ");
	scanf("%d",&num);
	cube(num);
	getch();
}
