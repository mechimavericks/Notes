// WAP to read a character and check if it is a digit, alphabet or special character.
#include<stdio.h>
void main()
{
	char ch;
	printf("Enter the Character:- ");
	scanf("%c",&ch);
	if(ch>='0' && ch<='9')
		printf("Digit");
	else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		printf("Alphabet");
	else
		printf("Special Character");
	getch();	
}
