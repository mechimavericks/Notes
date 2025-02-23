
#include<stdio.h>
void matrix(int mat[])
{
	int i,a = 0;
	for(i=0;i<10;i++)
		a = a+ mat[i];

	printf("Sum of entered number = %d",a);
		getch();		
}
void main()
{
	int i,a[10];
	printf("Enter 10 Numbers\n");
	for(i=0;i<10;i++)
			scanf("%d",&a[i]);
	matrix(a);
	getch();
}
