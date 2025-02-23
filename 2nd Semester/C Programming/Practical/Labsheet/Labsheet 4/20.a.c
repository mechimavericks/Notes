//WAP to find the result of following series.
//Sum = 11 + 22 + 33 + 44 + …………..till n terms

#include<stdio.h>
void main()
{
	int i,sum=0,n;
	printf("Enter the N Value:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+(i*11);
	}
	printf("Sum = %d",sum);
	getch();
}
