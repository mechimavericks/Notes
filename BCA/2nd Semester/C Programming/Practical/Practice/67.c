//WAP to find the maximum and minimum in 5 Number of array using pointer.
#include<stdio.h>
void main()
{
	int a[5],max,min,i,*p;
	p=a;
	printf("Enter the 5 Numbers:\n");
	for(i=0;i<5;i++)
		scanf("%d",&a[i]);
	max=min=*p;
	for(i=0;i<5;i++)
	{
		if(*(p+i)>max)
			max=*(p+i);
		if(*(p+i)<min)
			min=*(p+i);
	}
	printf("Maximum = %d\nMinimum = %d",max,min);
	getch();
}
