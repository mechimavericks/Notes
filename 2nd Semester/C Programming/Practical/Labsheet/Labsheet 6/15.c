//WAP to read an array and sort it in ascending order.
#include<stdio.h>
void main()
{
	int i,j,a[10],temp;
	printf("Enter the 10 Numbers in Array:\n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(a[i]>a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp	;			
			}
	printf("Ascending Order\n");
	for(i=0;i<10;i++)
		printf("%d\n",a[i]);
	getch();
}
