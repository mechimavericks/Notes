//WAP to enter a number and find out corresponding binary number. 
#include<stdio.h>
void main()
{
	int n,a[30],i;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	i=0;
	while(n>0)
	{
		a[i]=n%2;
		n=n/2;
		i++;
	}
	printf("The Binary Value = ");
	i=i-1;
    while(i>=0)
    {
    	printf("%d",a[i]);
    	i--;
	}
	getch();
}
