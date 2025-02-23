//WAP to read a simple structure and put it into a file and display on screen. 
#include<stdio.h>
struct file
{
	int sn,age;
	char name[25];
}f;
void main()
{
	FILE *fp;
	printf("Enter the S.N., Name and Age\n");
	scanf("%d%s%d",&f.sn,&f.name,&f.age);
	fp=fopen("file.txt","w");
	fprintf(fp,"%d\t%s\t%d",f.sn,f.name,f.age);
	fclose(fp);
	fp=fopen("file.txt","r");
	fscanf(fp,"%d%s%d",&f.sn,&f.name,&f.age);
	printf("S.N.\tName\tAge\n%d\t%s\t%d",f.sn,f.name,f.age);
	fclose(fp);
	getch();
}
