//WAP to read 2 strings, join it and display it using strcat().
#include<stdio.h>
#include<string.h>
void main()
{
	char str[15],str1[15];
	printf("Enter the Two string: \n");
	scanf("%s%s",str,str1);
	strcat(str,str1);
	printf("Combined = %s",str);
	getch();
}
