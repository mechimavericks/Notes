//WAP to input 10 numbers and find the sum and sum of even numbers.
#include<stdio.h>
void main()
{
	int a[10],i,sum=0, evensum=0;
	printf("Enter the 10 element:- \n");
	for(i=0;i<10;i++)
	{
		scanf("%d",&a[i]);
		sum = sum + a[i];
		if(a[i]%2==0)
			evensum=evensum + a[i];
	}
	printf("Sum = %d \nEven Sum = %d",sum, evensum);
	getch();
}
