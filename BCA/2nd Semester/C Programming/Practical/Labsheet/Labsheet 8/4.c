//WAP to input a string & reverse the string.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[50];
	printf("Enter the String:\n");
	gets(str);
	printf("Reverse: %s",strrev(str));
	getch();
}
