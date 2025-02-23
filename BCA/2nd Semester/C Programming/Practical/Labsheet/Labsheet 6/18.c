// WAP to input two 2d matrix, add, subtract and print it.
#include<stdio.h>
void main()
{
	int i,j,a[3][3],b[3][3];
	printf("Enter the Element of 3x3 A Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Enter the Element of 3x3 B Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&b[i][j]);
	printf("Addition of Matrix A and B\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]+b[i][j]);
		printf("\n");
	}
	printf("Subtraction of Matrix A and B\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]-b[i][j]);
		printf("\n");
	}
	getch();
}








