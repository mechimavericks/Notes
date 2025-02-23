#include<stdio.h>
void main()
{
	float pv,sv,n,depreciation;
	printf("Enter the Purchase Price, Salvage Value and Years of Service:- \n");
	scanf("%f %f %f",&pv,&sv, &n);
	depreciation = (pv-sv)/n;
	printf("The Depreciation Value of Item is %.2f",depreciation);
	getch();
	
}
