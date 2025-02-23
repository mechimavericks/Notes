//Using a pointer, WAP that finds out the largest number from the given list of numbers.
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *p,n,i,large;
	printf("How many Number you want to enter: ");
	scanf("%d",&n);
	p=(int*)malloc(n*sizeof(int));
	printf("Enter %d Numbers:\n",n);
	for(i=0;i<n;i++)
		scanf("%d",(p+i));
	large=*p;
	for(i=0;i<n;i++)
		if(*(p+i)>large)
			large = *(p+i);
	printf("Largest = %d",large);
	getch();
}
