// WAP to read three numbers and print the middle number.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("Enter the Three Numbers:- \n");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b && a<c)
		printf("%d is Middle Number.",a);
	else if(b>a && b<c)
		printf("%d is Middle Number.",b);
	else
		printf("%d is Middle Number.",c);
	getch();
}

