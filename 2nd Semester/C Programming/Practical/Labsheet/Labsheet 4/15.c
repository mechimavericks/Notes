//WAP to find all the Armstrong number between 100 to 500.
#include<stdio.h>
#include<math.h>
void main()
{
	int i,n,sum;
	printf("The Armstrong Number between 100 to 500 are:- \n");
	i=100;
	do
	{
		n=i;
		sum = 0;
		do
		{
			sum=sum+pow((n%10),3);
			n=n/10;
		}while(n!=0);
		if(sum==i)
			printf("%d\n",i);
		i++;
	}while(i<=500);
	getch();
}
