//WAP to read record of 5 employee of an office and print the record of person who have 2nd higest salary.
#include<stdio.h>
#include<string.h>
struct employee
{
	int sal;
	char name[25];
}e[5];
void main()
{
	int i,j,tsal;
	char tname[25];
	printf("Enter the Name and Salary of 5 Employee:\n");
	for(i=0;i<5;i++)
		scanf("%s%d",&e[i].name,&e[i].sal);
	for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
			if(e[i].sal<e[j].sal)
			{
				tsal=e[i].sal;
				e[i].sal=e[j].sal;
				e[j].sal=tsal;
				strcpy(tname,e[i].name);
				strcpy(e[i].name,e[j].name);
				strcpy(e[j].name,tname);				
			}
	printf("Second Largest Salary Employee Details:\nName=%s\tSalary=%d",e[1].name,e[1].sal);
	getch();
}
