//WAP to enter 5 number into the array and calculate the sum using pointer.
#include<stdio.h>
void main()
{
	int a[5],i,sum=0,*p;
	p=a;
	printf("Enter the 5 Numbers:-\n");
	for(i=0;i<5;i++)
		scanf("%d",&a[i]);
	for(i=0;i<5;i++)
		sum = sum + *(p+i);
	printf("Sum = %d",sum);
	getch();
}
