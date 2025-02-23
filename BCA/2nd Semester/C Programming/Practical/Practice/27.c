//WAP to calculate X^n using recursion.
#include<stdio.h>
int power(int x, int n)
{
	if(n==0)
		return 1;
	else
		return x*power(x,n-1);
}
void main()
{
	int x,n,result;
	printf("Enter the Value of X and N:- \n");
	scanf("%d%d",&x,&n);
	result = power(x,n);
	printf("Result = %d",result);
	getch();  
}
