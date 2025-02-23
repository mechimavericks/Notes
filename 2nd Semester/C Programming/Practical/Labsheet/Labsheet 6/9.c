//WAP that reads two matrices of size N*N and prints the sum and difference of those matrices.
#include<stdio.h>
void main()
{
	int a[3][3],b[3][3],i,j;
	printf("Enter the value of 3x3 A Matrix:- \n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			printf("A[%d][%d] = ",i,j);
			scanf("%d",&a[i][j]);
		}
	printf("Enter the value of 3x3 B Matrix:- \n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			printf("B[%d][%d] = ",i,j);
			scanf("%d",&b[i][j]);
		}
	printf("Sum of 3x3 A and B Matrices\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]+b[i][j]);
		printf("\n");
	}
	printf("Difference of 3x3 A and B Matrices\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]-b[i][j]);
				printf("\n");
	}
	getch();
}
