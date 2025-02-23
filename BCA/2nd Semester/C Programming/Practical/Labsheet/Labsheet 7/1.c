//WAP using pointer to compute sum and average of elements of array.
#include<stdio.h>
void main()
{
	int n,i,*p,sum=0;
	float avg;
	printf("How many Number You want to Enter: ");
	scanf("%d",&n);
	int a[n];
		p=a;
	printf("Enter the %d Numbers:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		sum= sum + *(p+i);
	}
	avg = sum/n;
	printf("Sum = %d\nAverage = %.2f",sum,avg);
	getch();		
}

