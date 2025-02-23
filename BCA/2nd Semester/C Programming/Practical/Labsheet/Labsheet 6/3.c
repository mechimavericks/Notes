//WAP to add two arrays and put in third array.
#include<stdio.h>
void main()
{
	int a[10],b[10],c[10],i;
	printf("Enter the 10 Number in first Array:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	printf("Enter the 10 Number in Second Array:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&b[i]);
	printf("The Sum of First and Second Array:- \n");
	for(i=0;i<10;i++)
	{
		c[i]=a[i]+b[i];
		printf("%d\n",c[i]);
	}
	getch();
}
