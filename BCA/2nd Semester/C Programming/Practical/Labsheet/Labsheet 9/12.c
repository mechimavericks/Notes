//WAP to use pointer as a member of structure.
#include<stdio.h>
struct student
{
	char name[25],*p;
}s;
void main()
{
	s.p=s.name;
	printf("Enter The Name:\n");
	scanf("%s",&s.name);
	printf("Name = %s",s.p);
	getch();	
}
