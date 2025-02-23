//WAP to generate a to z using loop.
#include<stdio.h>
void main()
{
	int i;
	printf("Generating from A to Z:\n");
	for(i=1;i<=26;i++)
	{
		putchar(64+i);
		printf("\n");
	}
	getch();
}
