//WAP to make a record of a a student using pointer to structure.( p->name,(*p).name) 
#include<stdio.h>
struct student
{
	char name[25];
	int rno,marks;
}s,*p;
void main()
{
	p=&s;
	printf("Enter the Roll.No., Name and Marks of student:\n");
	scanf("%d%s%d",&p->rno,p->name,&p->marks);
	printf("Roll No.\tName\tMarks\n%d\t%s\t%d",p->rno,p->name,p->marks);
	getch();	
}
