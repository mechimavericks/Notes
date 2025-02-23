//WAP that read two matrices and use pointer to sum them.
#include<stdio.h>
void main()
{
	int i,j,a[3][3],b[3][3],(*p1)[3],(*p2)[3];
	p1=a;
	p2=b;
	printf("Enter the Value of 3x3 A Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Enter the Value of 3x3 B Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&b[i][j]);
	printf("Sum of Two matrices\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",*(*(p1+i)+j)+*(*(p2+i)+j));
		printf("\n");
	}
	getch();
}

