//WAP to read a no. and find if the no. is even or odd
#include<stdio.h>
void main()
{
	int num;
	printf("Enter the Number:-");
	scanf("%d",&num);
	(num%2==0)?
		printf("%d is an Even Number.",num)	:
		printf("%d is an Odd Number.",num);	
		getch();
}
