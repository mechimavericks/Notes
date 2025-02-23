// WAP that read one character and convert it into upper character case, if it is in lower case and vice versa. 
//(ASCII code for A=65, Z=90, a=97, z=122)
#include<stdio.h>
void main()
{
	char ch;
	printf("Enter the One Character:- ");
	scanf("%c",&ch);
	if(ch>='a'&&ch<='z')
	{
		ch=ch-32;
		printf("Upper Case = %c",ch);
	}
	else if (ch>='A'&&ch<='Z')
	{
		ch=ch+32;
		printf("Lower Case = %c",ch);
	}
	else 
	printf("Invalid Entry.");
	getch();
}
