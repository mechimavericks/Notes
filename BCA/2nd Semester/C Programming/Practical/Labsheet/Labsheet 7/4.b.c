//WAP to find second and third largest number using pointer.
#include<stdio.h>
void main()
{
	int *p,a[10],i,j,temp;
	printf("Enter 10 Numbers:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	p=a;
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(*(p+i)<*(p+j))
			{
				temp=*(p+i);
				*(p+i)=*(p+j);	
				*(p+j)=temp;
			}
	printf("Second Largest = %d\nThird Largest = %d",*(p+1),*(p+2));
	getch();
}
