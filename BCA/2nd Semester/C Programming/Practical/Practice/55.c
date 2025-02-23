//WAP to input name, address and marks of 10 students and display all records whose marks is greater than 60 using structure variable.
#include<stdio.h>
#include<string.h>
struct students
{
	char name[50],add[25];
	int marks;
} s[5];
void main()
{
	int i;
	printf("Enter the Name, Address and Marks of 10 Students\n");
	for(i=0;i<3;i++)
	{
		fflush(stdin);
		printf("Name = ");
		gets(s[i].name);
		printf("Address = ");
		gets(s[i].add);
		printf("Marks = ");
		scanf("%d",&s[i].marks);
	}
	printf("\nName\tAddress\t\tMarks\n");
	for(i=0;i<3;i++)
		if(s[i].marks>60)
			printf("%s\t%s\t%d\n",s[i].name,s[i].add,s[i].marks);
	getch();
}
