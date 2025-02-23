//WAP to read a string & find the length using strlen()
#include<stdio.h>
#include<string.h>
void main()
{
	char str[25];
	printf("Enter the String:\n");
	gets(str);
	printf("Length = %d",strlen(str));
	getch();
}
