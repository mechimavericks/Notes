//WAP to read four digit no. & print the sum of each digit.
#include<stdio.h>
void main()
{
	int n,a,b,c,d;
	printf("Enter 4 digit Number:-");	
	scanf("%d",&n);
	d=n%10;
	n=n/10;
	c=n%10;
	n=n/10;
	b=n%10;
	n=n/10;
	a=n%10;
	printf("The Sum of Enterd Number is %d",a+b+c+d);
	getch();
}
