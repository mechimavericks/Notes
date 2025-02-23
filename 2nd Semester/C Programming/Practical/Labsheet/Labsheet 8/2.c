//WAP to check if two string are equal or not.(do not use strcmp)
#include<stdio.h>
void main()
{
	char str[50],str1[50];
	int i=0,j=0;
	printf("Enter the Two String:-\n");
	gets(str);
	gets(str1);
	while(str[i]!='\0')
		i++;
	while(str1[j]!='\0')
		j++;
	if(i==j)
		printf("String are Equal.");
	else
		printf("String are not equal.");
	getch();
}
