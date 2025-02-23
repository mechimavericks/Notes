//WAP to calculate length of string without using string function i.e strlen.
#include<stdio.h>
#include<string.h>
void main()
{
	int i;
	char str1[50];
	printf("Enter a line of Text:\n");
	gets(str1);
	i=0;
	while(str1[i]!='\0')
		i++;
	printf("Length of string = %d",i);
	getch();
}
