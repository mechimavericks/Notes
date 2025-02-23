//WAP to enter 9 Element into the array and display them in 3 x 3 order martix.
#include<stdio.h>
void main()
{
	int a[3][3],i,j;
	printf("Enter the 9 Element:- \n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Matrix in 3 x 3 Order\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	getch();
}
