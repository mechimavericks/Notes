//WAP to read two no. and print the largest no. using function
#include<stdio.h>
int large(int a,int b)
{
	return (a>b?a:b);
}
void main()
{
	int a,b;
	printf("Enter the Two Number:- ");
	scanf("%d%d",&a,&b);
	printf("%d is a largest Number.",large(a,b));
	getch();
}
