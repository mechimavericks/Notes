//WAP to read a number „n" and calculate its cube using function:
//a. No argument and no return type. 
#include<stdio.h>
#include<math.h>
void cube()
{
	int n,cube;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	cube = pow(n,3);
	printf("Cube = %d",cube);
}
void main()
{
	cube();
	getch();
	
}
