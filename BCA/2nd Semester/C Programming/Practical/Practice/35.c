//WAP to input age of 20 Employees and display age of employee whose is between 20 and 30.
#include<stdio.h>
void main()
{
	int age[20],i;
	printf("Enter the Age of 20 Employees:- \n");
	for(i=0;i<20;i++)
		scanf("%d",&age[i]);
	printf("Employees age between 20-30.\n");
	for(i=0;i<20;i++)
		if(age[i]>=20 && age[i]<=30)
			printf("%d\n",age[i]);
	getch();
}
