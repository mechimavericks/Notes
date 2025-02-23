//WAP to find all the prime numbers between 1 to 100.
#include<stdio.h>
void main()
{
	int i,j,a;
	printf("The Prime Numbers between 1 to 100 are:- \n");
	for(i=1;i<=100;i++)
	{
		a=0;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
				a++;
		}
		if(a==0)
			printf("%d\n",i);
	}
	getch();
}
