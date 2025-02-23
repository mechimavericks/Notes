//WAP to insert 10 number into the array and sort them in descending order.
#include<stdio.h>
void main()
{
	int a[10],i,j,temp;
	printf("Enter 10 Numbers:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	for(i=0;i<10;i++)
		for(j=i+1;j<10;j++)
			if(a[i]<a[j])
			{
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}	
printf("The ascending value are \n");
	for(i=0;i<10;i++)
		printf("%d\n",a[i]);
	getch();
}
