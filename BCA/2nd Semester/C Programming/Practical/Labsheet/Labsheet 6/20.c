/*  WAP to find transpose of 2d matrix.  */
#include<stdio.h>
void main()
{
	int i,j,a[3][3];
	printf("Enter the Element of 3x3 Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Matrix Before Transpose\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	printf("Matrix After Transpose.\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[j][i]);
		printf("\n");
	}
	getch();
}
