//WAP to read age of 'n' students and display the second lowest age
#include<stdio.h>
void main()
{
	int i,j,n,age[50],temp;
	printf("How many age you want to enter:- ");
	scanf("%d",&n);
	printf("Enter the age of %d students:-\n",n);
	for(i=0;i<n;i++)
		scanf("%d",&age[i]);
	for(i=0;i<n;i++)
		for(j=i+1;j<n;j++)
			if(age[i]>age[j])
			{
				temp = age[i];
				age[i] = age[j];
				age[j] = temp;
			}
	printf("Second Lowest age = %d",age[1]);
	getch();
}
