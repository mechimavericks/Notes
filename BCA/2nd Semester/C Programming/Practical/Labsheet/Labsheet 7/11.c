//WAP to read 3D-array of size 2*2*2 and print it.
#include<stdio.h>
void main()
{
	int i,j,k,a[2][2][2],(*p)[2][2];
	p=a;
	printf("Enter the value of 2x2x2 Array:\n");
	for(i=0;i<2;i++)
		for(j=0;j<2;j++)
			for(k=0;k<2;k++)
				scanf("%d",&*(*(*(p+i)+j)+k));
	printf("Entered Array:\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
			for(k=0;k<2;k++)
				printf("%d\t",a[i][j][k]);
		printf("\n");
	}
	getch();
}
