/*		WAP to read a record of 5 students and print the records of student. 
The record should include:Name,Age,Roll no    */
#include<stdio.h>
struct student{
	char name[25];
	int age,rno;
}s[5];
void main()
{
	int i;
	printf("Enter the Name, Age and Roll No of 5 Students\n");
	for(i=0;i<5;i++)
		scanf("%s%d%d",s[i].name,&s[i].age,&s[i].rno);
	printf("Name\tAge\tRoll No.\n");
	for(i=0;i<5;i++)
		printf("%s\t%d\t%d\n",s[i].name,s[i].age,s[i].rno);
	getch();
}
