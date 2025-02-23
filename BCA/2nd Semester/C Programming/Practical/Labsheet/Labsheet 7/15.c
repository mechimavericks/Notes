//WAP to find the length of given string.
#include<stdio.h >
void main()
{
	char i,str[15],*p;
	p=str;
	printf("Enter the String:  ");
	scanf("%s",&str);
	i=0;
	while(*(p+i)!='\0')
		i++;	
	printf("Length of String = %d",i);
	getch();
}
