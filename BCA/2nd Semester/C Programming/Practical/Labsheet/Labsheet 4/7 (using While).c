//WAP that checks whether the given number(x) is prime or not.[Hint: prime no. is that number which is NOT
//divisible by numbers other than 1 and itself. (Using while, for)
#include<stdio.h>
void main()
{
	int n,i=2,a=0;
	printf("Enter the Number:- ");
	scanf("%d",&n);
	while(i<n)
	{
		if(n%i==0)
			a++; 
		i++;
	}
	if(a>0)
		printf("%d is Not a Prime Number.",n);
	else
		printf("%d is a Prime Number.",n);
	getch();
}

