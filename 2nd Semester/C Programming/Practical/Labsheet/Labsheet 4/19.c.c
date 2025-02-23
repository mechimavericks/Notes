//WAP to generate the following output
//1
//1 0
//1 0 1
//1 0 1 0
#include<stdio.h>
void main()
{
	int i,j;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=i;j++)
			if(j%2==0)
				printf("0\t");
			else
				printf("1\t");
		printf("\n");
	}
	getch();
}
