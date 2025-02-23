//WAP to read the age of 20 persons and count the number of persons in the age group 50 to 60.
#include<stdio.h>
void main()
{
	int n[20],a=0,i;
	printf("Enter the age of 20 Persons:- \n");
	for(i=0;i<20;i++)
	scanf("%d",&n[i]);
	for(i=0;i<20;i++)
	{
		if(n[i]>=50 && n[i]<=60)
			a++;
	}
	printf("The Number of Persons between 50 to 60 are %d.",a);
	getch();
}
