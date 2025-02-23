//WAP to illustrate pointer
#include<stdio.h>
void main()
{
	int a, *p;
	a=5;
	p=&a;
	printf("Address of a = %u\n",&a);
	printf("Address of a = %u\n",p);
	printf("Data of a = %d\n",a);
	printf("Data of a = %d\n",*p);	
	*p=20;
	printf("Data of a = %d\n",a);
	printf("Data of a = %d\n",*p);	
	getch();
}
