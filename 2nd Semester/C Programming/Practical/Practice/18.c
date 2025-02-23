//WAP to enter a number and check whether it's armstrong or not.
#include<stdio.h>
#include<math.h>
void main()
{
	int n,a,temp,sum=0;
 printf("Enter the Number:- \n");
	scanf("%d",&n);
	temp=n;
	do
	{
		a=n%10;
		sum=sum+pow(a,3);
		n=n/10;
	}while(n!=0);
	if(temp==sum)
	printf("%d is an Armstrong Number.",temp);
	else
	printf("%d is not an Armstrong Number.",temp);
	getch();
}
