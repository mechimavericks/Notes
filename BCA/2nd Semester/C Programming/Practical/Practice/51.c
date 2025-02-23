//WAP to reverse the string using strrev function.
#include<stdio.h>
#include<string.h>
void main()
{
	int i,j;
	char str1[50],str2[50];
	printf("Enter a line of text:\n");
	fflush(stdin);
	gets(str1);
	i=0;
	while(str1[i]!='\0')
		i++;
	j=i-1;
	i=0;
	while(str1[i]!='\0')
	{
		str2[j]= str1[i];
		i++;
		j-- ;
	}
	printf("Reverse = %s ",str2);
	getch();
}
