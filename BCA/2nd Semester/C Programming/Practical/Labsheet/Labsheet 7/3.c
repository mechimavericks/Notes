//WAP using DMA and pointer to read n numbers from user and display sum and average.
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int i,n,*p,sum = 0;
	float avg;
	printf("How Many Number You want to insert: ");
	scanf("%d",&n);
	p=(int*) malloc(n * sizeof(int));
	printf("Enter %d Numbers:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",(p+i));
		sum=sum + *(p+i);
	}
	avg = sum/n;
	printf("Sum = %d\nAverage = %.2f\n",sum,avg);
	getch();
}
