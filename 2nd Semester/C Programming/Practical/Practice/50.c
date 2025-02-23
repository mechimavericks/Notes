//WAP to copy a string from one to another without using strcpy funtion.
#include<stdio.h>
#include<string.h>
void main()
{
	char str1[50],str2[50];
	printf("Enter the Line of Text:\n");
	gets(str1);
	int i=0;
	while(str1[i]!='\0')
	{
		str2[i] = str1[i];
		i++;
	}
	printf("String 1 = %s \nString 2 = %s",str1,str2);
	getch();
}
