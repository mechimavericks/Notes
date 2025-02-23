//WAP that use function swap two given values. The swap() should returns nothing (void). Hint:use (a)call by value and (b) call by reference
#include<stdio.h>
void swap (int a, int b)
{
	printf("Before Swapping\nA = %d\nB = %d\n",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("After Swapping\nA = %d\nB = %d",a,b);
}
void main()
{
	int a,b;
	printf("Enter the value of a and b:- \n");
	scanf("%d%d",&a,&b);
	swap(a,b);
	getch();
}
