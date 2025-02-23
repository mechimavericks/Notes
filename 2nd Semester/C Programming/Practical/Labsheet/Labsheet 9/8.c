//WAP to make record of 5 student.(name,follno marks of 3 subjects &print total)
#include<stdio.h>
struct student
{
	int rno,sub[3];
	char name[25];
}s[5];
void main()
{
	int i,j;
	printf("Enter the Roll No., Name and Marks of 3 Subject of 5 Students:\n");
	for(i=0;i<3;i++)
	{
		scanf("%d%s",&s[i].rno,&s[i].name);
		for(j=0;j<3;j++)
			scanf("%d",&s[i].sub[j]);
	}
	printf("Roll No.\tName\tSub1\tSub2\tSub3\tTotal\n");
	for(i=0;i<3;i++)
	{
		printf("%d\t%s\t",s[i].rno,s[i].name);
		for(j=0;j<3;j++)
			printf("%d\t",s[i].sub[j]);
		printf("%d\n",s[i].sub[0]+s[i].sub[1]+s[i].sub[2]);
	}
	getch();
}
