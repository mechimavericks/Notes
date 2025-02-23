//WAP to copy characters from one file to another file.
#include<stdio.h>
void main()
{
	char ch;
	FILE *fp1,*fp2;
	if((fp1=fopen("source.txt","r"))==NULL)
		printf("Souce.txt file doesn't Exist.\n");
	else
	{
		fp2=fopen("destination.txt","w");
		while(fscanf(fp1,"%c",&ch)!=EOF)
			fprintf(fp2,"%c",ch);
		fclose(fp1);
		fclose(fp2);
		printf("\nCharacter Copied from Source File to Destinattion File.");
	}
	getch();
}
