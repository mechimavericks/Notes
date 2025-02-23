//WAP to read number and find whether the given number is Armstrong or not
#include<stdio.h>
#include<math.h>
void main()
{
	int n,sum=0,temp;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	temp=n;
	while(n!=0)
	{
		sum=sum+pow((n%10),3);
		n=n/10;
	}
	if(sum==temp)
		printf("%d is Armstrong Number.",temp);
	else
		printf("%d is not Armstrong Number.",temp);
	getch();
}
