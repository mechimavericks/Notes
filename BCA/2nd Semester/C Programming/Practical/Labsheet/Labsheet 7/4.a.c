//WAP to find largest and smallest number from list of number using pointer. 
#include<stdio.h>
void main()
{
	int *p,a[10],i,large,small;
	printf("Enter 10 Numbers:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	p=a;
	large=small= *p;
	for(i=0;i<10;i++)
	{
		if(*(p+i)>large)
			large = *(p+i);
		if(*(p+i)<small)
			small = *(p+i);
	}
	printf("Largest = %d\nSmallest = %d",large,small);
	getch();
}
