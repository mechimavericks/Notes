//WAP to illustrate gets and puts function.
#include<stdio.h>
#include<string.h>
void main()
{
	char name[25];
	printf("Enter  Your Name : \n");
	gets(name);
	printf("Hey ");
	puts(name);
	getch();
}
