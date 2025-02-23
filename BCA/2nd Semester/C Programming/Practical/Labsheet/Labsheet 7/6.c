//WAP to sort n numbers in ascending order using DMA and function.
#include<stdio.h>
#include<stdlib.h>
void sort(int *p,int *n)
{
	int i,j,temp;
	for(i=0;i<*n;i++)
		for(j=i+1;j<*n;j++)
			if(*(p+i)>*(p+j))
			{
				temp=*(p+i);
				*(p+i)=*(p+j);	
				*(p+j)=temp;
			}
}
void main()
{
	int *p,n,i;
	printf("How Many Number You want to enter: ");
	scanf("%d",&n);
	p= (int*)malloc(n*sizeof(int));
	printf("Enter %d Numbers:\n",n);
	for(i=0;i<n;i++)
		scanf("%d",(p+i));
	sort(p,&n);
	printf("After Sorting in Ascendig Order:\n");
	for(i=0;i<n;i++)
		printf("%d\n",*(p+i));
	getch();
}
