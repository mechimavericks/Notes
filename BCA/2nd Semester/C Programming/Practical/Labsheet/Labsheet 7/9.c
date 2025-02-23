//WAP to read two matrix of(size 3*3),add it and store in 3rd marix using pointer& function.
#include<stdio.h>
void sum(int (*x)[3],int (*y)[3],int (*z)[3])
{
	int i,j;
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			*(*(z+i)+j)=*(*(x+i)+j)+*(*(y+i)+j);
}
void main()
{
	int i,j,a[3][3],b[3][3],c[3][3];
	printf("Enter the Value of 3x3 A Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Enter the Value of 3x3 B Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&b[i][j]);
	sum(a,b,c);
	printf("Sum of A and B Matrices:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",c[i][j]);
		printf("\n");
	}
	getch();
}
