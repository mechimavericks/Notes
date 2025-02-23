/*  WAP to read a line of text & print each character of the text in reverse case. i.e. print lowercase if it is in 
uppercase & viceversa.     */
#include<stdio.h>
void main()
{
	char str[50];
	int i;
	printf("Enter the Line of Text:\n");
	gets(str);
	i=0;
	while(str[i]!='\0')
	{
		if(str[i]>='a' && str[i]<='z')
			str[i]=str[i]-32;
		else if(str[i]>='A' && str[i]<='Z')
			str[i]=str[i]+32;
		i++;
	}
	printf("Result = %s",str);
	getch();
}
