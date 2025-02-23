/*		WAP to read a record of 5 students and print the records of student print the record according to name in alphabitical 
order. 
The record should include:Name,Age,Roll no    */
#include<stdio.h>
#include<string.h>
struct student{
	char name[25];
	int age,rno;
}s[5];
void main()
{
	int i,j,temp,atemp;
	char stemp[25];
	printf("Enter the Name, Age and Roll No. of 5 Students:\n");
	for(i=0;i<5;i++)
		scanf("%s%d%d",s[i].name,&s[i].age,&s[i].rno);
	for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
			if(strcmp(s[i].name,s[j].name)>0)
			{
				strcpy(stemp,s[j].name);
				strcpy(s[j].name,s[i].name);
				strcpy(s[i].name,stemp);
				temp=s[j].rno;
				s[j].rno=s[i].rno;
				s[i].rno=temp;
				atemp=s[j].age;
				s[j].age=s[i].age;
				s[i].age=atemp;
			}
	printf("Name\tAge\tRoll No.\n");
	for(i=0;i<5;i++)
		printf("%s\t%d\t%d\n",s[i].name,s[i].age,s[i].rno);
	getch();	
}
