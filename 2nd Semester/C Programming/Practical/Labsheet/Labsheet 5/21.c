//WAP to print “Hello” n times using recursive function.
#include<stdio.h>
int print(int n)
{
	if(n==1)
		return  printf("Hello\n");
	else
	{
		printf("Hello\n");
		return print(n-1);
	}
}
void main()
{
	int n;
	printf("Enter How Many Times You Like to Print:- ");
	scanf("%d",&n);
	print(n);	
	getch();
}
