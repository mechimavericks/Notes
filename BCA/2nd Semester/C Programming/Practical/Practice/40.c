//WAP to enter value for 3x3 matrix and transpose them.
#include<stdio.h>
void main()
{
	int a[3][3],i,j;
	printf("Enter the element of Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			printf("a[%d][%d] = ",i,j);
			scanf("%d",&a[i][j]);
		}
	printf("Matrix in 3 x 3 Order\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	printf("Transpose Of Matrix in 3 x 3 Order\n");
	for(j=0;j<3;j++)
	{
		for(i=0;i<3;i++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	getch();
}
