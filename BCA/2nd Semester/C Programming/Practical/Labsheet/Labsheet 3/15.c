// WAP to read Annual Salary of an employee and decide tax withheld as follows: 
//Salary tax
//Up to 100000 0%
//Up to 150000 15%
//Above 150000 25%


#include<stdio.h>
void main()
{
	int salary,tax;
	printf("Enter the Salary:- ");
	scanf("%d",&salary);
	if(salary<=100000)
	{
		tax = salary * 0/100;
		printf("Your Tax is %d",tax);
	}
	else if(salary<=150000)
	{
		tax=salary*15/100;
		printf("Your Tax is %d",tax);
	}
	else
	{
		tax = salary * 25/100;
		printf("Your Tax is %d",tax);
	}
	getch();
}
