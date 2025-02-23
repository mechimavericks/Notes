/* Write a menu driven program and perform the following operation:
a) reverse the number.
b) to find if given no. is prime or not.
c) to get the sum of digit of a given no
d) to find if the given no. is palindrome or not.		*/
#include<stdio.h>
void rev(int n)
{
	int rev = 0;
	while(n!=0)
	{
		rev = rev*10 + n%10;
		n= n/10;
	}
	printf("Reverse = %d",rev);	
}
void prime(int n)
{
	int i,a=0;
	for (i=2; i<n; i++)
	{
		if (n%i ==0)
			a++;
	}
	if(a>0)
		printf("Not Prime Number.");
	else 
		printf("Prime Number.");
}
void sum(int n)
{
	int sum = 0;
	while(n!=0)
	{
		sum = sum + n%10;
		n= n/10;
	}
	printf("Sum = %d",sum);		
}
void pal(int n)
{
	int temp=n,rev = 0;
	while(n!=0)
	{
		rev = rev*10 + n%10;
		n= n/10;
	}
	if(temp==rev)
		printf("Palindrome Number.");
	else
		printf("Not Palindrome Number.");
}
void main()
{
	char ch;
	int num;
	printf("Choose one Of this Option\na) Reverse the Number \nb) To find if given no. is prime or not. \nc) To get the sum of digit of given no. \nd) To find if the given no. is palindrome or not.");
	printf("\nEnter your Selection(a,b,c,d):- ");
	scanf("%c",&ch);
	printf("Enter the Number:- ");
	scanf("%d",&num);
	if(ch=='a' || ch== 'A')
		rev(num);
	else if(ch=='b' || ch== 'B')
		prime(num);
	else if(ch=='c' || ch== 'C')
		sum(num);
	else if(ch=='d' || ch== 'D')
		pal(num);
	else
		printf("Invalid entry");
	getch();
}
