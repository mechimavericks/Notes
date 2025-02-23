//WAP to read a record of a person & display it.Include: Name,age,roll no,address,marks of 5 subjects.
#include<stdio.h>
struct student{
	int age,rno,marks[5];
	char name[25],address[25];
}s;
void main()
{
	int i;
	printf("Enter the ROll No. Name Address Age and Marks of 5 Subject:\n");
	scanf("%d%s%s%d",&s.rno,&s.name,&s.address,&s.age);
	for(i=0;i<5;i++)
		scanf("%d",&s.marks[i]);
	printf("Roll No.\tName\tAddress\tAge\tMarks of 5 Subject\n");
	printf("%d\t%s\t%s\t%d\t",s.rno,s.name,s.address,s.age);
	for(i=0;i<5;i++)
		printf("%4d\t",s.marks[i]);
	getch();
}
