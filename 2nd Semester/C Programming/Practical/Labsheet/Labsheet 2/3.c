//WAP to read 3 digit no. & find sum of square of digits.
#include<stdio.h>
#include<math.h>
void main()
{
	int a,b,c,n,sum;
	printf("Enter the 3 Digit Number:- ");
	scanf("%d",&n);
	c=n%10;
	n=n/10;
	b=n%10;
	n=n/10;
	a=n%10;
	sum=pow(a,2)+pow(b,2)+pow(c,2);
	printf("The Sum of Square of Digits is %d",sum);
	getch();
}
