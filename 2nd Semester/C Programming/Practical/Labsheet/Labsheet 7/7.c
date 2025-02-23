//WAP to merge two sorted array into third array using pointer.
#include<stdio.h>
void main()
{
	int i,j,temp,a[5],b[5],c[10],*p1,*p2;
	printf("Enter the 5 Number in First Array:\n");
	for(i=0;i<5;i++)
		scanf("%d",&a[i]);
	printf("Enter the 5 Number in Second Array:\n");
	for(i=0;i<5;i++)
		scanf("%d",&b[i]);
	p1=a;p2=b;
	for(i=0;i<5;i++)
	{
		c[i]= *(p1+i);
		c[i+5]= *(p2+i);
	}
	p1=c;
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(*(p1+i)>*(p1+j))
			{
				temp = *(p1+i);
				*(p1+i)=*(p1+j);
				*(p1+j)=temp; 
			}
	printf("Merged Array and Sorted in Ascending Order:\n");
	for(i=0;i<10;i++)
		printf("%d\n",*(p1+i));
	getch();
}
