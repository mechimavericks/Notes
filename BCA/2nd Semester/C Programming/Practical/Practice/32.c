#include<stdio.h>
void main()
{
	char n,i,j,k;
	if(n!=0)
		bottom: printf("Thank You.");
	top: printf("Enter the 1 or not.:- ");
	scanf("%c",&n);
	if(n=='a')
		goto top;
	else
		goto bottom;

	getch();
}
