//WAP that reads a matrix and identify if the given matrix is symmetric or not.(array contd with functions)
//(transpose of matrix are equal.)
#include<stdio.h>
void main()
{
	int a[3][3],i,j,c=0;
	printf("Enter the value of 3x3 Matrix:- \n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			printf("A[%d][%d] = ",i,j);
			scanf("%d",&a[i][j]);
		}
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			if(a[i][j]==a[j][i])
				c++;
	if(c == 9)
		printf("Matrix is Symmetric.");
	else
		printf("Matrix is Not Symmetric.");
	getch();
}
