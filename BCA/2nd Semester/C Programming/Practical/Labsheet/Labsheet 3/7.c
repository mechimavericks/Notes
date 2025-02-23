//WAP to calculate sum, difference, multiple, division of two numbers. (Use if else statement)
#include<stdio.h>
void main()
{
	int a,b;
	char c;
	printf("Enter \na for Sum \nb for Difference \nc for multiple \nd for Division \n\n");
	scanf("%c",&c);
	printf("Enter the two Number:- \n");
	scanf("%d%d",&a,&b);
	if(c=='a' || c=='A')
		printf("Sum = %d",a+b);
	else if(c=='b' || c=='B')
		printf("Difference = %d",a-b);
	else if(c=='c' || c=='C')
		printf("Multiple = %d",a*b);
	else if(c=='d' || c=='D')
		printf("Division = %d",a/b);
	else
		printf("Invalid Entry.");	
getch();
}
