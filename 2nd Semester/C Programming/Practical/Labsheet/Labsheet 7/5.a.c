//WAP to sort n numbers in ascending order using pointer.
#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *p,i,j,a[10],temp;
	printf("Enter 10 Numbers:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	p=a;
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(*(p+i)>*(p+j))
			{
				temp=*(p+i);
				*(p+i)=*(p+j);	
				*(p+j)=temp;
			}
	printf("After Sorting in Ascendig Order:\n");
	for(i=0;i<10;i++)
		printf("%d\n",a[i]);
	getch();
}
