/*. In inventory management, the economic order quantity for a single item is given
by: EOQ =v (2* demand rate * setup costs)/ (holding cost per item per unit time)
And the optional time between orders is given by:
TBO = v (2 * setup costs)/ (demand rate * holding cost per item per unit time)
WAP to compute EOQ and TBO, given demand rate, setup costs and the holding cost*/
#include<stdio.h>
#include<math.h>
void main()
{
	float dr,sc,hc,eoq,tbo;
	printf("Enter the Value of Demand Rate, Setup Costs and Holding Cost:- \n");
	scanf("%f %f %f",&dr,&sc,&hc);
	eoq=sqrt((2*dr*sc)/hc);
	tbo=sqrt((2*sc)/(dr*hc));
	printf("Economic Order Quantity(EOQ) = %.2f\nTime Between Order(TBO) = %.2f",eoq,tbo);
	getch();
}
