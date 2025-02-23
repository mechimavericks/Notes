//WAP to sort n numbers in ascending order using pointer and function.
#include<stdio.h>
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
	int n,i;
	printf("How Many Number You want to insert: ");
	scanf("%d",&n);
	int a[n];
	printf("Enter %d Numbers:\n",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	sort(&a[0],&n);
	printf("After Sorting in Ascendig Order:\n");
	for(i=0;i<n;i++)
		printf("%d\n",a[i]);
	getch();
}
