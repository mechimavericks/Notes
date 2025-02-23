//.WAP to enter values in array called myarray of size 15 and display the elements of array
#include<stdio.h>
void main()
{
	int myarray[15],i;
	printf("Enter the 15 Value:- \n");
	for(i=0;i<15;i++)
		scanf("%d",&myarray[i]);
	printf("The Entered Elements are\n");
	for(i=0;i<15;i++)
		printf("%d\n",myarray[i]);
	getch();
}
