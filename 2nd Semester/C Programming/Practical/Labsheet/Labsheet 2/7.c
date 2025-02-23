//WAP to read a no. & find out if it is Armstrong no. or not. Hint: N=a^3+b^3+c^3
#include<stdio.h>
#include<math.h>
void main()
{
	int a,num,temp,sum=0;
	printf("Enter the Number:- ");
	scanf("%d",&num);
	temp=num;
	while(num!=0)
	{
		a=num%10;
		sum=sum+(pow(a,3));
		num=num/10;
	}	
	if(temp==sum)
	printf("%d is an Armstrong Number.",temp);
	else
	printf("%d is not an Armstrong Number.",temp);
	getch();
}

