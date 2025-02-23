//WAP to read arry of 10 no.s and display it using array and function.
#include<stdio.h>
void display(int num[])
{
	int i;
	printf("The entered Numbers are:\n");
	for(i=0;i<10;i++)
		printf("%d\n",num[i]);
}
void main()
{
	int a[10],i;
	printf("Enter the 10 Numbers:\n");
	for(i-0;i<10;i++)
		scanf("%d",&a[i]);
	display(a);
	getch();
}
