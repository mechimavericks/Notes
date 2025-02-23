/*   WAP to input two 2d matrix, multiply and print it.  */
#include<stdio.h>
void main()
{
	int i,j,k,a[3][3],b[3][3],mul[3][3];
	printf("Enter the Element of 3x3 A Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Enter the Element of 3x3 B Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&b[i][j]);
	printf("Multiplication of Matrix A and B\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			mul[i][j]=0;
			for(k=0;k<3;k++)
				mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
			printf("%d\t",mul[i][j]);
		}
		printf("\n");
	}
	getch();
}
