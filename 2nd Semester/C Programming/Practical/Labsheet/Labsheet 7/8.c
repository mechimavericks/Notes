//WAP to read 2D-array (size 3*3) using pointer and diaplay it.
#include<stdio.h>
void main()
{
	int i,j,a[3][3],(*p)[3];
	p=a;
	printf("Enter the value of 3x3 Array:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&*(*(p+i)+j));
	printf("Entered Array:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	getch();
}
