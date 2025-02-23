/*  WAP to0 store ID, name, marks of 5 students into sturcutre varaible called student and display same result in appropriate 
format using pointer */
#include<stdio.h>
#include<string.h>
struct student
{
	int id;
	char name[25];
	float marks;
} s[5],*p;
void main()
{
	int i;
	p=s;
	printf("Enter the ID, Name and Marks of the 5 Students:\n");
	for(i=0;i<2;i++)
		scanf("%d%s%f",&s[i].id,&s[i].name,&s[i].marks);
	printf("ID\tName\tMarks\n");
	for(i=0;i<2;i++)
		printf("%d\t%s\t%.2f\n",(p+i)->id,(p+i)->name,(p+i)->marks);
	getch();
}
