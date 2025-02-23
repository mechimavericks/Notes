//WAP to enter a character and convert it into lowercase if it in uppercase and vice versa.
#include<stdio.h>
#include<ctype.h>
void main()
{
	char a;
	printf("Enter the Character:- ");
	a=getchar();
	if(a>='a' && a<='z')
	{
		a=toupper(a);
		printf("Uppercase = %c", a);
	}
	else
	{
		a=tolower(a);
		printf("Lowercase = %c", a);
	}
	getch();
}
