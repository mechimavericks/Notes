//Wap to enter name of 5 stuedent in an array and sort them in ascending order and dispaly.
#include<stdio.h>
#include<string.h>
void main()
{
	int i,j;
	char name[5][25],temp[25];
	printf("Enter the Name of 5 Student:\n");
	for(i=0;i<5;i++)
	{
		fflush(stdin);   //to flush the buffer 
		gets(name[i]);
	}
	printf("\nBefore sorting\n");	
	for(i=0;i<5;i++)
		printf("%s\n",name[i]);
	for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
			if(strcmp(name[i],name[j])>0)
			{
				strcpy(temp,name[i]);
				strcpy(name[i],name[j]);
				strcpy(name[j],temp);
			}
	printf("\nSorted Name List\n");
	for(i=0;i<5;i++)
		printf("%s\n",name[i]);
	getch();
}
