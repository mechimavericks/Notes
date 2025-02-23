//WAP that accepts a line from user & prints it in upper case.(use gets to read line)
#include<stdio.h>
#include<string.h> 
void main()
{
	char line[50];
	printf("Enter the line of Text:\n");
	gets(line);
	printf("%s",strupr(line));
	getch();
}
