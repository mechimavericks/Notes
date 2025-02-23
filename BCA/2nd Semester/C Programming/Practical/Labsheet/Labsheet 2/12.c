//WAP to read 2 no.s , if the first no. is greater than second no. ,display the sum else display the product of two no.s
//(use ternary operator).
#include<stdio.h>
void main()
{
	int a,b;
	printf("Enter the Two Number:-");
	scanf("%d%d",&a,&b);
	(a>b)?
		printf("The Sum of %d and %d is %d.",a,b,a+b)
	:
		printf("The Product of %d and %d is %d.",a,b,a*b);
		getch();
}
