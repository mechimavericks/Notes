/* WAP to print the following using do-while Loop.
*
*  *
*  *  *
*  *  *  *
*  *  *  *  *			*/
#include<stdio.h>
void main()
{
	int i,j;
	i=1;j=1;
	do{
		do{
			printf("*\t");
			j++;
		}while(j!=i);
	printf("\n");
	i++;
	}while(i!=5);
}
