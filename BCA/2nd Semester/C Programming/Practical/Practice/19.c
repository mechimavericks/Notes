//WAP to to printf all the armstrong number from 1 to 100.
#include<stdio.h>
#include<math.h>
void main()
{
	int i,j,a;
		printf("The Armstrong Number from 1 to 100 are:- \n");
	i=1;
do
{	
int sum =0;
	j=i;
	do
	{
	
		a=j%10;
		sum=sum+pow(a,3);
		j=j/10;
	}while(j!=0);
	if(sum==i)
	{
	printf("%d\n",i);
	}
	i++;
}while(i<=100);
getch();
}
