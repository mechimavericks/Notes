//WAP that checks whether the given number(x) is prime or not.[Hint: prime no. is that number which is NOT
//divisible by numbers other than 1 and itself. (Using while, for)
#include<stdio.h>
void main()
{
	int n,i,a;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	a=0;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
			a++;
	}
	if(a>0)
		printf("%d is not Prime Number.",n);
	else
		printf("%d is Prime Number.",n);
	getch();
}
