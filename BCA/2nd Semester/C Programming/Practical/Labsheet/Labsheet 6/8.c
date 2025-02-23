//WAP to sort the given list of numbers.
#include<stdio.h>
void main()
{
	int num[10],i,j,temp;
	printf("Enter the 10 Numbers:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&num[i]);
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(num[i]>num[j])
			{
				temp=num[i];
				num[i] = num[j];
				num[j] = temp;
			}
	printf("Sorting the Number is Ascending Order\n");
	for(i=0;i<10;i++)
		printf("%d\n",num[i]);
	getch();
}
