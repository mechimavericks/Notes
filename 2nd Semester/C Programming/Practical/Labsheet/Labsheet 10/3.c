//WAP to read name and age from the user in the user defined file and print it.
#include<stdio.h>
#include<string.h>
void main()
{
	char name[25];
	int age;
	FILE *fp;
	printf("Enter the Name and Age:\n");
	gets(name);
	scanf("%d",&age);
	fp=fopen("detail.txt","w");
	fprintf(fp,"%s\t%d",name,age);
	fclose(fp);
	printf("Entered Details are\nName\tAge\n");
	fp=fopen("detail.txt","r");
	fscanf(fp,"%s%d",&name,&age);
	printf("%s\t%d\n",name,age);
	fclose(fp);
	getch();
}
