//WAP to read a character and convert it into upper case if it is lowercase and vice versa.
#include<stdio.h>
void convert(char a)
{
	if(a>= 'a' && a <= 'z')
	{
		a = a - 32;
		printf("Uppercase = %c ",a);
	}
	else if (a>='A' && a<='Z')
	{
		a = a + 32;
		printf("Lowercase = %c",a);
	}
	else
		printf("Invalid Entry.");
}
void main()
{
	char a;
	printf("Enter the Character:- ");
	scanf("%c",&a);
	convert(a);
	getch();
}
