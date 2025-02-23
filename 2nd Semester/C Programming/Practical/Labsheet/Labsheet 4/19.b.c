//WAP to generate the following output
//b)
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
#include<stdio.h>
void main()
{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
			printf("%2d",i);
		printf("\n");
	}
	getch();
}
