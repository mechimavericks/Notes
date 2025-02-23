//WAP to accept ID and name of 5 Employee from the screen and save it into employee.txt file and read form the file and display the result in screen.
#include<stdio.h>
#include<string.h>
void main()
{
	int i,id;
	char name[25];
	FILE *fp;
	fp=fopen("employee.txt","w");
	printf("Enter the Id and Name of 5 Employee:-\n");
	for(i=0;i<3;i++)
	{
		printf("ID: ");
		scanf("%d",&id);
		printf("Name: ");
		fflush(stdin);
		gets(name);
		fprintf(fp,"%d\t%s\n",id,name);
	}
	printf("\nWriting Process Completed.\n");
	fclose(fp);
	fp=fopen("employee.txt","r");
	printf("ID\tName\n");
	for(i=0;i<3;i++)
	{
		fscanf(fp,"%d %s",&id,&name);
		printf("%d\t%s\n",id,name);
	}
	fclose(fp);
	printf("Reading Process Completed.");
	getch();	
}
