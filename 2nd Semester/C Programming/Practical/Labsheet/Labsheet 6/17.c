//WAP to input a 2d matrix and print it.
#include<stdio.h>
void main()
{
	int i,j, a[3][3];
	printf("Enter the element of 3x3 matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("\nEntered 3x3 matrix:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	getch();		
}
