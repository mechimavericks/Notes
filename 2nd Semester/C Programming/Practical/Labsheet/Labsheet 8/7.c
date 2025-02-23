//WAP that reads a string & checks if it is a palindrome.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[25],temp[25];
	printf("Ente the String:\n");
	gets(str);
	strcpy(temp,str);
	strrev(str);
	if(strcmp(temp,str)==0)
		printf("Palindrome");
	else
		printf("Not Palindrome.");
	getch();
}
