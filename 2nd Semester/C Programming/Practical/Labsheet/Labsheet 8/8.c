//WAP to sort an array of string.
#include<stdio.h>
#include<string.h>
void main()
{
	char str[15][5],temp[15];
	int i,j;
	printf("Enter the 5 string:\n");
	for(i=0;i<5;i++)
		gets(str[i]);
	for(i=0;i<5;i++)
		for(j=i+1;j<5;j++)
			if(strcmp(str[i],str[j])>0)
			{
				strcpy(temp,str[i]);
				strcpy(str[i],str[j]);
				strcpy(str[j],temp);
			}
	printf("Sorting in Alphabital Order.\n");
	for(i=0;i<5;i++)
		printf("%s\n",str[i]);
	getch();
}
