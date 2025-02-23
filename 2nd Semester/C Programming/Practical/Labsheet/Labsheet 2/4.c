//WAP to read 3 digit no. & find if it is palindrome or not. Hint: use ternary operator
#include<stdio.h>
void main()
{
	int a,b=0,num;
	printf("Enter 3 Digit Number:-");
	scanf("%d",&num);
	a=num;
	while(num!=0){
		b=(b*10)+(num%10);
		num=num/10;
	}
	(b==a)?
	printf("it's Palindrome Number.")
	:
	printf("it's not Palindrome Number.");
	getch();
}
