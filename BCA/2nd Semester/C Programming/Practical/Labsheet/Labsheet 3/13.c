//WAP to read five numbers and find the largest number.
#include<stdio.h>
void main()
{
	int a,b,c,d,e,f;
	printf("Enter the Five Number:- \n");
	scanf("%d%d%d%d%d",&a,&b,&c,&d,&e);
	f=a>b?a:b;
	f=f>c?f:c;
	f=f>d?f:d;
	f=f>e?f:e;
	printf("%d is the Largest Number.",f);
	getch();
}
