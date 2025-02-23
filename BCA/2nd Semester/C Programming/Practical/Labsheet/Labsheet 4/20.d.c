/*  WAP to find the result of following series.
Sum = 1/2 + 3/4 + 5/6 +7/8 + ………till “n” terms    */

#include<stdio.h>
void main()
{
	int n;
	float i,sum = 0;
	printf("Enter the Value of n:- ");
	scanf("%d",&n);
	for(i=1.0;i<=2*n;i=i+2)
	{
		sum = sum+i/(i+1);
	}
	printf("Sum = %.4f",sum);
	getch();
}
