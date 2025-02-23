//WAP to enter a character and convert it into lowercase if it in uppercase and vice versa.
#include<stdio.h>
void main()
{
	char a;
	printf("Enter the Character:- ");
	scanf("%c",&a);
	if(a>='a' && a<='z')
	{
		a= a - 32;
		printf("Uppercase = %c", a);
	}
	else
	{
		a= a + 32;
		printf("Lowercase = %c", a);
	}
	getch();
}
