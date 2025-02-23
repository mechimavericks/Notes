//WAP to store n numbers into the array and find out maximun and minimum element in the array.
#include<stdio.h>
void main()
{
	int n,a[100],i,max,min;
	printf("Enter How many Number you want to insert:- ");
	scanf("%d",&n);
	printf("Enter %d Numbers:- \n",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	max = a[0];
	min = a[0];
	for(i=1;i<n;i++)
	{
		if(max<a[i])
			max = a[i];
		if(min>a[i])
			min = a[i];
	}
	printf("Maximum = %d \nMinimum = %d",max,min);
	getch();
}
