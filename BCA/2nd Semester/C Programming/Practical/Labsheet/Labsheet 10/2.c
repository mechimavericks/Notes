//WAP to read character until the enter key is pressed and change all character to upper case and display it.
#include<stdio.h>
#include<string.h>
void main()
{
	int i;
	char ch[25];
	FILE *fp;
	printf("Enter the line of Character:\n");
	gets(ch);
	fp=fopen("characters.txt","w");
	strupr(ch);
	fprintf(fp,"%s",ch);
	fclose(fp);
	fp=fopen("characters.txt","r");
	printf("Printed Character in File are:\n");
	i=0;
	while(fscanf(fp,"%c",&ch[i])!=EOF)
	{
		printf("%c\t",ch[i]);
		i++;
	}
	fclose(fp);
	getch();
}
