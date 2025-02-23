#include<stdio.h>
void sum(int *x, int *y, int *z)
{
	*z = *x - *y;
}
void main()
{
	int a,b,c;
	printf("Enter the Two NUmber:-\n");
	scanf("%d%d",&a,&b);
	sum(&a,&b,&c);
	printf("Sum = %d",c);
}
