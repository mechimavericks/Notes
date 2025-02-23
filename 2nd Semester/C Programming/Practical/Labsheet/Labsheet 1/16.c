//Enchanging the value
#include<stdio.h>
void main()
{
	int a,b,temp;
	printf("Enter the Two Number:- \n");
	scanf("%d %d",&a,&b);
	printf("The entered Number \nA=%d \nB=%d",a,b);
	temp=a;
	a=b;
	b=temp;
	printf("\nThe exchange value\nA=%d \nB=%d",a,b);
	getch();
}
