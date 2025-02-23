//WAP to read a line of text & count the no. of digits,uppercase & lowercase characters in the line.
#include<stdio.h>
void main()
{
	int i,digit,upr,low;
	char str[50];
	printf("Enter the Line of Text:\n");
	gets(str);
	digit=upr=low=0;
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]>='0' && str[i]<='9')
			digit++;
		else if(str[i]>='a' && str[i]<='z')
			low++;
		else if(str[i]>='A' && str[i]<='Z')
			upr++;
	}
	printf("Digit = %d\nUppercase = %d\nLowercase = %d\n",digit,upr,low);
	getch();
}
