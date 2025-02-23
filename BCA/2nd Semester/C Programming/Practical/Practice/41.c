/*   WAP to input 10 number into the array and search a particular numbr in array and also find out the number it's repetation
along with array position.   */
#include<stdio.h>
void main()
{
	int a[20],i,n,b=0;
	printf("Enter the 10 Numbers:- \n");
	for(i=0;i<10;i++)
		scanf("%d",&a[i]);
	printf("Number You want to search:- ");
	scanf("%d",&n);
	for(i=0;i<10;i++)
		if(a[i]==n)
			b++;
	if(b==0)
		printf("%d doesn't Exist.",n);
	else 
		printf("%d Exist and Repeated for %d times.",n,b);
	printf("\nThe repeated Position\n");
	for(i=0;i<10;i++)
		if(a[i]==n)
		printf("%d\n",i);	
	getch();	
}
