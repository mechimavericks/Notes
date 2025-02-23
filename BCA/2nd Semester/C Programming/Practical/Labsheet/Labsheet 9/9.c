/*  WAP to read record of 5 employee & print the record of person which have highest & lowest 
salary.(Include:name,salary,address)     */
#include<stdio.h>
#include<string.h>
struct employee
{
	int sal;
	char name[25],add[15];
}e[5];
void main()
{
	int i,j,maxsal,minsal;
	char maxname[25],minname[25],maxadd[15],minadd[15];	
	printf("Enter the Name, Address and Salary of 5 Employee:\n");
	for(i=0;i<5;i++)
		scanf("%s%s%d",&e[i].name,&e[i].add,&e[i].sal);
	maxsal=minsal=e[0].sal;
	strcpy(maxname,e[0].name);
	strcpy(maxadd,e[0].add);
	strcpy(minname,e[0].name);
	strcpy(minadd,e[0].add);
	for(i=0;i<5;i++)
	{
		if(maxsal<e[i].sal)
		{
			strcpy(maxname,e[i].name);
			strcpy(maxadd,e[i].add);
			maxsal=e[i].sal;
		}
		if(minsal>e[i].sal)
		{
			strcpy(minname,e[i].name);
			strcpy(minadd,e[i].add);
			minsal=e[i].sal;
		}
	}
	printf("Highest Salary\nName = %s\tAddress = %s\tSalary = %d\n",maxname,maxadd,maxsal);
	printf("Lowest Salary\nName = %s\tAddress = %s\tSalary = %d\n",minname,minadd,minsal);		
	getch();
}
