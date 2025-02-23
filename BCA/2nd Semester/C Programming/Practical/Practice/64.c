//Pointer with  array storing 5 result.
#include<stdio.h>
void main()
{
	int a[5],*p,i;
	p=a;
	printf("Enter the 5 Numbers:-\n");
	for(i=0;i<5;i++)
		scanf("%d",&*(p+i));
	printf("The Entered Number are:-\n");
	for(i=0;i<5;i++)
		printf("%d\n",*(p+i));
	getch();
}
