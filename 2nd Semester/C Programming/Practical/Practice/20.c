//WAP to swap the value without using third variable.
#include<stdio.h>
void main()
{
	int a,b;
	printf("Enter the Two Numbers:- \n");
	scanf("%d%d",&a,&b);
	printf("Before Swapped\nA = %d\nB = %d\n",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("After Swapped\nA = %d\nB = %d\n",a,b);
	getch();	
}
