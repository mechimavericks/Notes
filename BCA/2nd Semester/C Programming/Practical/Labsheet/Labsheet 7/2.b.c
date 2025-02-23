//WAP that takes two numbers from user and evalutes the sum,difference and product using pointer and function.
#include<stdio.h>
void calc(int *p1,int *p2,int *p3,int *p4,int *p5)
{
	*p3=*p1+*p2;
	*p4=*p1-*p2;
	*p5=*p1**p2;
}
void main()
{
	int a,b,s,d,p;
	printf("Enter Two Number: \n");
	scanf("%d%d",&a,&b);
	calc(&a,&b,&s,&d,&p);
	printf("Sum = %d\nDifference = %d\nProduct = %d",s,d,p);
	getch();
}
