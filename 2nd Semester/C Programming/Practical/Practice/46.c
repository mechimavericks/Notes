/*   WAP to generate following patterns:- 
a
a  b
a  b  c
a  b  c  d
a  b  c  d  e	`	*/
#include<stdio.h>
void main()
{
	int i,j;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
			printf("%c\t",96+j);
		printf("\n");
	}
	getch();
}
