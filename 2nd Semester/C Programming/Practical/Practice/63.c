//WAP to exchange value of two variable using function with pointer.
#include<stdio.h>
void exchange(int *p, int *p1)
{
	int t;
	t=*p;
	*p=*p1;
	*p1=t;
}
void main()
{
	int a,b;
	printf("Enter the Two Number:-\n");
	scanf("%d%d",&a,&b);
	printf("Before Exchanging\nA=%d\nB=%d\n",a,b);
	exchange(&a,&b);
	printf("After Exchanging\nA=%d\nB=%d\n",a,b);	
	getch();
}

