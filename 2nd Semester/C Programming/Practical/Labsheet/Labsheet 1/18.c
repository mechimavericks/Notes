/* A computer manufacturing company has the following monthly compensation policy to their sales persion:
Minimus Base Salary = 1500.00
Bonus for every comuter sold =200.00
Commission on the total monthly sales = 2%
since the price of computer are changing, the sales price of each computer is fixed at the beginning of every monnth.
Given the base salary, bonus and commission rate, the inputs necessary to calculate are the price of each computer and the number sold during the month.
The gross salary is given by the equation:
Gross Salary = Base Salary + (Quantity * Bonus Rate) + (Quantity + Price) * Commission Rate  */
#include<stdio.h>
void main()
{
	float p,gross_salary; int no;
	printf("Enter the Price of Computer and No. of Computer Sold:- \n");
	scanf("%f %d",&p,&no);
	gross_salary= 1500+(no * 200 ) + (no*p)*2/100;
	printf("The Gross Salary is %.2f",gross_salary);
	getch();	
}
