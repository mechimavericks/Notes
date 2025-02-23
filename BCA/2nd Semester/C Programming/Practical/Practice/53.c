//WAp to input name and marks of 10 students into the array and sort them descending order of marks and display result inot screen.
#include<stdio.h>
#include<string.h>
void main()
{
	int i,j,marks[10],tempmarks;
	char name[10][25],temp[25];
	printf("Enter the Name and Marks of 10 Students:\n");
	for(i=0;i<5;i++)
	{
		fflush(stdin);
		gets(name[i]);
		scanf("%d",&marks[i]);
	}
	for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
			if(marks[i]<marks[j])
			{
				tempmarks=marks[i];
				marks[i]=marks[j];
				marks[j]=tempmarks;
				strcpy(temp,name[i]);
				strcpy(name[i],name[j]);
				strcpy(name[j],temp);
			}
	printf("Name\tMarks\n");
	for(i=0;i<5;i++)
		printf("%s\t%d\n",name[i],marks[i]);
	getch();
}
