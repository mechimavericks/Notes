/*  WAP to find the result of following series.
Sum = 1/x + 2/x3 + 3/x5 + 4/x7……….till “n” terms    */
#include<stdio.h>
#include<math.h>
void main()
{
	int i,x,n;
	float sum =0;
	printf("Enter the value of x and n:- \n");
	scanf("%d%d",&x,&n);
	for(i=1;i<=n;i++)
	{
		sum=sum+(i/pow(x,(i+(i-1))));
	}
	printf("Sum = %.4f",sum);
	getch();
}
