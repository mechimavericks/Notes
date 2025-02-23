//WAP to read two matrix of(size 3*3),multiply it and store in 3rd marix using pointer& function.
#include<stdio.h>
void product(int (*x)[3],int (*y)[3],int (*z)[3])
{
	int i,j,k;
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
		{
			*(*(z+i)+j)=0;
			for(k=0;k<3;k++)
				*(*(z+i)+j)=*(*(z+i)+j)+*(*(x+i)+k)**(*(y+k)+j);
		}
}
void main()
{
	int i,j,a[3][3],b[3][3],mul[3][3];
	printf("Enter the Value of 3x3 A Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&a[i][j]);
	printf("Enter the Value of 3x3 B Matrix:\n");
	for(i=0;i<3;i++)
		for(j=0;j<3;j++)
			scanf("%d",&b[i][j]);
	product(a,b,mul);
	printf("Multiplication of A and B Matrices:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
			printf("%d\t",mul[i][j]);
		printf("\n");
	}
	getch();
}
