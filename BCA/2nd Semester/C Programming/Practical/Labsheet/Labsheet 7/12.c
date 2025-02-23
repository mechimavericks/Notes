//WAP to check palindrome of string using pointer.
#include<stdio.h >
#include<string.h>
void main()
{
	char i,j,ch[15],temp[15],*p;
	p=ch;
	printf("Enter the String:  ");
	scanf("%s",&ch);
	i=0;
	while(*(p+i)!='\0')
	{
		temp[i]=*(p+i);
		i++;	
	}
	j=i-1;
	i=0;
	while(temp[i]!='\0')
	{
		*(p+j)=temp[i];
		i++;
		j--;
	}
	if(strcmp(ch,temp)==0)
		printf("Palindrome.");
	else 
		printf("Not Palindrome.");
	getch();
}
