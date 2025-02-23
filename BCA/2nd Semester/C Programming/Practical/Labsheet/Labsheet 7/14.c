//WAP to read an array of integers and print its element in reverse order.
#include<stdio.h>
void main()
{
	int i,a[10],*p;
	p=a;
	printf("Enter the 10 Numbers:\n");
	for(i=0;i<10;i++)
		scanf("%d",(p+i));
	printf("Reverse Order:\n");
	for(i=9;i>=0;i--)
		printf("%d\n",a[i]);
	getch();
}
