//WAP to read a string & find out the length of string.(do not use strlen)
#include<stdio.h>
void main()
{
	int i;
	char txt[50];
	printf("Enter the string:\n");
	gets(txt);
	for(i=0;txt[i]!='\0';i++);
	printf("Size of String:- %d",i);
	getch();
}
