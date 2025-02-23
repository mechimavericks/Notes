//WAP to find the result of following series.
//Sum = 1/x + 2/x2 + 3/x3 + 4/x4……….till “n” terms
#include<stdio.h>
#include<math.h>
void main()
{
	int n,i,x;
	float sum=0;
	printf("Enter the Value x and n:- \n");
	scanf("%d%d",&x,&n);
	for(i=1;i<=n;i++)
	{
		sum=sum + (i/pow(x,i));
	}
	printf("Sum = %.4f",sum);
	getch();
}

