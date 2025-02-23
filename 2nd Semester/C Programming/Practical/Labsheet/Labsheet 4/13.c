// WAP to accept any number n and print the cube of all numbers from 1 to n which is exactly divisible by 3.
#include<stdio.h>
#include<math.h>
void main()
{
	int n,i,a;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	printf("The cube of all numbers from 1 to %d which is exactly divisible by 3 are:- \n",n);
	i=1;
	do
	{
		a=pow(i,3);
		if(a%3==0)
			printf("%d\n",a);
		i++;
	}while(i<=n);
	getch();
}
