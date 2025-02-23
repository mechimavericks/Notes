// WAP to print the following 
// 99    97    95    93........1
#include<stdio.h>
void main()
{
	int i;
	for(i=99;i>=1;i=i-2)
	printf("%4d",i); //%4d indicates 4 blank spaces
	getch();
	
}
