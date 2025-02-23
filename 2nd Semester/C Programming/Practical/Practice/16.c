//WAP to enter a number and find out corresponding factors of this number.
#include<stdio.h>
void main()
{
	int n,i;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
			printf("%d\n",i);
	}
	getch();
}
