//WAP to read a no. „n" and print its square using function.
#include<stdio.h>
#include<math.h>
void square(int);
void main()
{
	int n;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	square (n);
	getch();
}
void square (int n)
{
	int sq;
	sq = pow(n,2);
	printf("Square of %d is %d.",n,sq);	
}
