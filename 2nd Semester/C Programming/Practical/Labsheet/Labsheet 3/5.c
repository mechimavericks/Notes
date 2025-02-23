// WAP that asks the user to enter his/her marks of subjects and prints the corresponding grade.
//Grade Table: >=80: A, >=60: B, >=50: C, >=40: D, <40: F.
#include<stdio.h>
void main()
{
	int n;
	printf("Enter Your Marks:- ");
	scanf("%d",&n);
	if(n>=80)
		printf("A");
	else if(n>=60)
		printf("B");
    else if(n>=50)
		printf("C");
	else if(n>=40)
		printf("D");
	else if(n<40)
		printf("F");		
getch();
}
