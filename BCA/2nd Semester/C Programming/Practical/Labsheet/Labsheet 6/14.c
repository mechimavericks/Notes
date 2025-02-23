//WAP to read two arrays, add two array and store the result in third array and print it using function
#include<stdio.h>
void sum (int x[], int y[])
{
	int i,c[10];
	printf("The Sum of A and B array \n");
	for(i=0;i<10;i++)
	{
		c[i] = x[i] + y[i];
		printf("%d + %d =  %d\n",x[i],y[i],c[i]);	
	}
}
void main()
{
	int i,a[10],b[10];
	printf("Enter the 10 element in A array:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	printf("Enter the 10 element in B array:\n");
	for(i=0;i<10;i++)
		scanf("%d",&b[i]);
	sum(a,b);
	getch();
}

