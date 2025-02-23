//WAP to generate fibonacci series up to n terms.
#include<stdio.h>
int series(int n)
{
	if(n==0)
		return 0;
	else if(n==1)
		return 1;
	else 
		return (series(n-1)+series(n-2));
}
void main()
{
	int n,i,x;
	printf("Enter the Number of terms:- ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		x=series(i);
		printf("%d\t",x);
	}
	getch();
}
