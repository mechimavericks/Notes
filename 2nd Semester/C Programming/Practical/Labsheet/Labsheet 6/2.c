//WAP to sum and average of all the elements of array.
#include<stdio.h>
void main()
{
	int a[10],sum=0,i;
	float average = 0;
	printf("Enter the 10 Numbers:-\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
		sum = sum + a[i];
	}
	average = sum / 10;
	printf("Sum = %d \nAverage = %.2f",sum,average);
	getch();
}
