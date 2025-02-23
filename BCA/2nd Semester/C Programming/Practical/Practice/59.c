//WAP to store id, name ans salary of employee into the structure variable and sort them on the basis of descending order of salary of 5 employee.
#include<stdio.h>
#include<string.h>
struct employee{
	int id,sal;
	char name[25];
}e[5];
void main()
{
	int i,j,tid,tsal;
	char tname[25];
	printf("Enter ID, Name and Salary of 5 People \n");
	for(i=0;i<3;i++)
	{
		fflush(stdin);
		printf("ID[%d] = ",i+1);
		scanf("%d",&e[i].id);
		printf("Name[%d] = ",i+1);
		scanf("%s",&e[i].name);
		printf("Salary [%d] = ",i+1);
		scanf("%d",&e[i].sal);		
	}
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			if(e[i].sal<e[j].sal)
			{
				tsal = e[i].sal;
				e[i].sal = e[j].sal;
				e[j].sal = tsal;
				tid = e[i].id;
				e[i].id = e[j].id;
				e[j].id = tid;
				strcpy(tname,e[i].name);
				strcpy(e[i].name,e[j].name);				
				strcpy(e[j].name,tname);
			}
	printf("ID \t Name \t\tSalary\n");
	for(i=0;i<3;i++)
		printf("%d\t%s\t\t%d\n",e[i].id,e[i].name,e[i].sal);
	getch();
}
