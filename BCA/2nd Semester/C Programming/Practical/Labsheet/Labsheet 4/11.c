// WAP to read a number and find whether the given number is palindrome or not
#include<stdio.h>
void main()
{
	int n,sum = 0, temp;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	temp = n;
	while (n!=0)
	{
		sum = (sum*10) + (n%10);
		n=n/10; 
	}
	if(sum==temp)
		printf("%d is Palindrome Number.",temp);
	else
		printf("%d is not Palindrome Number.",temp);
	getch();
}

