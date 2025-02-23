#include<stdio.h>
void display (int a)
{
	printf("Entered Number:-\n");
	printf("%d\n",a);
}
void main()
{
	int num[10],i;
	printf("Enter the 10 Numbers:\n");
	for(i=0;i<10;i++)
		scanf("%d",&num[i]);
	for(i=0;i<10;i++)
		display(num[i]);
	getch();
		
}

