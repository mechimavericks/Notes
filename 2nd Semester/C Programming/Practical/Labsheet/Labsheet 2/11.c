//. WAP to read 3 no. and display the greatest no. (use ternary operator)
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter the 3 Numbers:- ");
	scanf("%d%d%d",&a,&b,&c);
	(a>b&&a>c)?
	printf("%d is a Greatest Number.",a)
	: (b>a&&b>c)?
	printf("%d is a Greatest Number.",b)
	:
		printf("%d is a Greatest Number.",c);
		getch();
	}
