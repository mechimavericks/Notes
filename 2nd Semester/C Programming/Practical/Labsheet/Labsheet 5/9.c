//WAP to read a no. „n" from user and print your name "n" times using function.
#include<stdio.h>
void print(int n)
{
	int i;
	for(i=1;i<=n;i++)
		printf("Santosh Bhandari\n");
}
void main()
{
	int n;
	printf("Enter How may times you want to Dispaly:- ");
	scanf("%d",&n);
	print(n);
	getch();
}
