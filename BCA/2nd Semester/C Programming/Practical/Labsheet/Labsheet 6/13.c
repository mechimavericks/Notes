/*		WAP to read array of 5 no.s and display:
(a) the largest no. using function and array. 
(b) the smallest no. using function and array.  	   */
#include<stdio.h>
void check(int a[])
{
	int i,max,min;
	max = min = a[0];
	for(i=1;i<5;i++)
	{
		if(max < a[i])
			max = a[i];
		if(min > a[i])
			min = a[i];	
	}
	printf("Maximum = %d \nMinimum = %d",max,min);
}
void main()
{
	int i,num[5];
	printf("Enter the 5 Numbers\n");
	for(i=0;i<5;i++)
		scanf("%d",&num[i]);
	check(num);
	getch();
}
