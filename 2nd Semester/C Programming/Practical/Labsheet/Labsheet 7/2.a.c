//WAP that takes two numbers from user and evalutes the sum,difference and product using pointer.
#include<stdio.h>
void main()
{
	int a,b,*p1,*p2;
	printf("Enter two Numbers:\n");
	scanf("%d%d",&a,&b);	
	p1=&a,p2=&b;
	printf("Sum = %d\nDifference = %d\nProduct = %d",*p1+*p2,*p1-*p2,*p1**p2);
	getch();
}
