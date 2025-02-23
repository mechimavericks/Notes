#include<stdio.h>
void main()
{
	int n,i,j,k;
	printf("Enter the How Long You want to Print:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
			printf("*");
		printf("\n");
	}
	for(i=n-1;i>=1;i--)
	{
		for(j=i;j>=1;j--)
			printf("*");
		printf("\n");
	}
	getch();
}
