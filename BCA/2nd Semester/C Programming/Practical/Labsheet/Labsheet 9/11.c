//WAP to make a record of 5 students using structure array and pointer.
#include<stdio.h>
struct student
{
	char name[25];
	int rno,marks;
}s[5],*p;
void main()
{
	int i;
	p=s;
	printf("Enter the Roll.No., Name and Marks of student:\n");
	for(i=0;i<5;i++)
		scanf("%d%s%d",&(p+i)->rno,(p+i)->name,&(p+i)->marks);
	printf("Roll.No.\tName\tMarks\n");
	for(i=0;i<5;i++)
		printf("%d\t%s\t%d\n",(p+i)->rno,(p+i)->name,(p+i)->marks);
	getch();	
}
