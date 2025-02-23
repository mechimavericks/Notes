//WAP to use all the string functions
#include<stdio.h>
#include<string.h>
void main()
{
	int l;
	char str1[25], str2[25];
	printf("Enter the line of Text[25]: \n");
	fflush(stdin);
	gets(str1);
	l=strlen(str1);
	printf("Length of String = %d",l);
	strrev(str1);
	printf("\nReverse String = %s ",str1);
	strupr(str1);
	printf("\nUppercase = %s",str1);
	strlwr(str1);
	printf("\nLowercase = %s", str1);
	strcpy(str2,str1);
	printf("\nString Two = %s\n",str2);
	if(strcmp(str1, str2)==0)
		printf("Both are Equal");
	else if(strcmp(str1, str2)==1)
		printf("String 1 is Greater.");
	else 
		printf("String 2 is Greater.");
	strcat(str1,str2);
	printf("\nConcatination of two string = %s",str1);
	getch();
}
