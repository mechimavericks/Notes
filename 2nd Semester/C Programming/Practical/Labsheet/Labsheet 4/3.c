//WAP which display the average & sum of nth no input by the user.
#include<stdio.h>
void main()
{
	int i,n,sum=0; 
	float average;
	printf("Enter the nth Number:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
	average = sum/n;
	printf("Sum = %d \nAverage = %.2f",sum,average);
	getch();
}
