//WAP to read character from keyboard and store in file, read it from file and display it on the screen
#include<stdio.h>
void main()
{
	char ch;
	FILE *fp;
	fp=fopen("character.txt","w");
	printf("Enter the Character: ");
	scanf("%c",&ch);
	fprintf(fp,"%c",ch);
	fclose(fp);
	fp=fopen("character.txt","r");
	fscanf(fp,"%c",&ch);
	printf("Printed Character in File is %c",ch);
	fclose(fp);
	getch();
}
