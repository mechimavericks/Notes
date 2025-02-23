//WAP to check if two string are equal or not.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[25],str1[25];
	printf("Enter Two String:\n");
	scanf("%s%s",str,str1);
	if(strcmp(str,str1)==0)
		printf("Both String are Equal.");
	else 
		printf("String are not Equal.");
	getch();
}
