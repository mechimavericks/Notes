//WAP to separate odd and even elements of array.
#include<stdio.h>
void main()
{
	int a[100],i,n;
	printf("How many Element you want to enter:- ");
	scanf("%d",&n);
	printf("Enter the %d Elements:- \n",n);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
	printf("Odd Numbers:\n");
	for(i=0;i<n;i++)
		if(a[i]%2!=0)
			printf("%d\n",a[i]);
	printf("Even Numbers:\n");
	for(i=0;i<n;i++)
		if(a[i]%2==0)
			printf("%d\n",a[i]);
	getch();
}
