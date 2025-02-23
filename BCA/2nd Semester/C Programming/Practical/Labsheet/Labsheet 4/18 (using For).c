//WAP that generates the multiplication as shown below. [Use nested looping] (Using while, for)
//1 2 3 4 5 6 7 8 9 10
//2 4 6 7 8 10 14 16 18 20
//…………………………………
//…………………………………
//10 20 30 40 50 60 70 80 90 100
#include<stdio.h>
void main()
{
	int i,j;
	for(i=1;i<=10;i++)
	{
		for(j=1;j<=10;j++)
			printf("%d\t",i*j);
				printf("\n");
	}
	getch();
}
