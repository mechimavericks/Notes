//WAP to find the sum and average of n numbers usign DMA function
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *p,n,s,i;
	float a;
	printf("Enter How many Number You want to store:- \n");
	scanf("%d",&n);
	p=(int*) malloc(n*sizeof(int));
	if(p==NULL)
		printf("Memory Allocation Failed.");
	else
	{
		s = 0;
		printf("Enter the %d Numbers:-\n",n);
		for(i=0;i<n;i++)
		{
			scanf("%d",(p+i));
			s=s+ *(p+i);
		}
		a=s/n;
		printf("Sum = %d\nAverage = %.2f\n",s,a);
	}
	getch();	
}
