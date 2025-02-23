//WAP to read name of 10 persons,sort it & display it
#include<stdio.h>
#include<string.h>
void main()
{
	int i,j;
	char name[25][10],temp[25];
	printf("Enter the Name of 10 persons: \n");
	for(i=0;i<10;i++)
		gets(name[i]);
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(strcmp(name[i],name[j])>0)
			{
			strcpy(temp,name[i]);
			strcpy(name[i],name[j]);
			strcpy(name[j],temp);
			}
	printf("Sorted In Alphabitical Order\n");
	for(i=0;i<10;i++)
		printf("%s\n",name[i]);
	getch();
}
