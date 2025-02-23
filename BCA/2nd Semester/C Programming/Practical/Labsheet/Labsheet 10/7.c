/*   WAP to make menu-based program using file to append,read,delete data in file.
Use switch for append,read,delete,quit    */ 
#include<stdio.h>
#include<string.h>
#include<stdlib.h>
FILE *fp1,*fp2;
struct record
{
	int sn,sal;
	char name[25];
}r;
void append()
{
	int i,a;
	fp1=fopen("record.txt","a");
	printf("How many record You want to enter:\n");
	scanf("%d",&a);
	printf("Enter the S.N., Name and Salary:\n");
	for(i=0;i<a;i++)
	{
		scanf("%d%s%d",&r.sn,&r.name,&r.sal);
		fprintf(fp1,"%d\t%s\t%d\n",r.sn,r.name,r.sal);
	}
	fclose(fp1);
	printf("Record Updated.");

}
void  read()
{
	fp1=fopen("record.txt","r");
	printf("\nS.N.\tName\tSalary\n");
	while(fscanf(fp1,"%d%s%d",&r.sn,&r.name,&r.sal)!=EOF)
		printf("%d\t%s\t%d\n",r.sn,r.name,r.sal);
	fclose(fp1);
	printf("\nRecord Displayed.");	
}
void delete()
{
	int a=0;
	char tname[25];
	fp1=fopen("record.txt","r");
	fp2=fopen("record1.txt","w");
	printf("Enter Name  Of the Person You want to delete:\n");
	scanf("%s",&tname);
	while(fscanf(fp1,"%d%s%d",&r.sn,&r.name,&r.sal)!=EOF)
	{
		if(strcmp(r.name,tname)==0)
		{
			printf("Record Deleted.\n");
			a++;
		}
		else
			fprintf(fp2,"%d\t%s\t%d\n",r.sn,r.name,r.sal);
	}
	if(a==0)
		printf("Record doesn't exist.");
	fclose(fp1);
	fclose(fp2);
	remove("record.txt");
	rename("record1.txt","record.txt");		
}
void main()
{
	int n;
	printf("***Menu***\n1.Append\n2.Read\n3.Delete\n4.Quit\nEnter You Choice: ");
	scanf("%d",&n);
	switch(n)
	{
		case 1: 
			append();
			break;
		case 2:
			read();
			break;
		case 3:
			delete();
			break;
		case 4:
			exit(1);		
		default:
			printf("Invalid entery.");
	}
	getch();
}
