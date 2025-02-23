//WAP to make nested structure.put a structure(date of birth) within structure record.
#include<stdio.h>
struct record
{
	int sn;
	char name[25];
	struct date
	{
	int birth;
	}d;
}r;

void main()
{
	printf("Enter the S.N., Name and Date of Birth:- \n");
	scanf("%d%s%d",&r.sn,&r.name,&r.d.birth);
	printf("S.N. = %d\nName = %s\nDate of Birth = %d",r.sn,r.name,r.d.birth);
	getch();
}
