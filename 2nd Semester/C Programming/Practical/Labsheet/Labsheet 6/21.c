//WAP to input a 3d matrix and print it
#include<stdio.h>
void main()
{
	int i,j,k,a[3][3][3];
	printf("Enter the Element of 3x3x3 Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			for(k=0;k<3;k++)
				scanf("%d",&a[i][j][k]);
	printf("\nEntered Matrix\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			for(k=0;k<3;k++)
				printf("%d\t",a[i][j][k]);
		printf("\n");
	}
	getch();
}
