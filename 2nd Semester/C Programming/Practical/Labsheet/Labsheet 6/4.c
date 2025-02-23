//WAP to find largest and smallest element in an array
#include<stdio.h>
void main()
{
	int a[10],i,lar,sma;
	printf("Enter the 10 Numbers:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	lar = sma = a[0];
	for(i=1;i<10;i++)
	{
		if(a[i]>lar)
			lar = a[i];
		if(a[i]<sma)
			sma = a[i];
	}
	printf("Largest = %d \nSmallest = %d",lar,sma);
	getch();
}
