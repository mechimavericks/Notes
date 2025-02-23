//WAP that takes three numbers and prints the largest number.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter the Three Number:- \n");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b && a>c)
		printf("%d is a Largest Number.",a);
	else if(b>c)
		printf("%d is a Largest Number.",b);
	else
		printf("%d is a Largest Number.",c);
	getch();
}
