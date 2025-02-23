//WAP to read a line of text & print each character,print in reverse case (use toupper() & tolower(),<ctype.h>).
#include<stdio.h>
#include<ctype.h>
void main()
{
	int i;
	char a[25];
	printf("Enter the Line of Text:\n");
	gets(a);
	printf("Reverse Case of Each Character:\n");
	i=0;
	do{
		if(a[i]>='a' && a[i]<='z')
			a[i]=toupper(a[i]);
		else if(a[i]>='A' && a[i]<='Z')
			a[i]=tolower(a[i]);	
		printf("%c\t",a[i]);
		i++;
	}while(a[i]!='\0');
	getch();
}
