//WAP that reads two matrices of size N*N and prints the product of those matrices.
#include<stdio.h>
void main()
{
	int a[3][3],b[3][3],i,j,k,pro[3][3];
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
	printf("Product of 3x3 Matrix A and B\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			pro[i][j]=0;
			for(k=0;k<3;k++)
				pro[i][j]=pro[i][j] + a[i][k]*b[k][j];
			printf("%d\t",pro[i][j]);
		}
		printf("\n");	
	}
	getch();	
}
