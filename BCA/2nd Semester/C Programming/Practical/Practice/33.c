// WAP to input 5 Numbers in the array and display each element.
#include<stdio.h>
void main()
{
	int a[5],i;
	printf("Enter the 5 element:- \n");
	for(i=0;i<5;i++)
		scanf("%d",&a[i]);
	printf("The Elementa are\n");
	for(i=0;i<5;i++)
		printf("%d\n",a[i]);
	getch();
}
