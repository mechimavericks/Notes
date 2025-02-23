/* A program should be able to calculate sum, difference, product, division of two numbers. Your program should 
display the list of options from which user selects one of them. (Use switch case)
a. Add b. Subtract c. Product d. Division
Enter your choice: 2    */

#include<stdio.h>
void main()
{
	char ch;
	int a,b;
	printf("a. Add\tb. Subtract\tc.Product\td.Division\n");
	printf("Enter Your Choice(a,b,c,d):- ");
	scanf("%c",&ch);
	printf("\nEnter the Two Number:- \n");
	scanf("%d%d",&a,&b);
	switch(ch)
	{
		case 'a':
		case 'A':
			printf("Addition = %d",a+b);
			break;
		case 'b':
		case 'B':
			printf("Subtraction = %d",a-b);
			break;
		case 'c':
		case 'C':
			printf("Product = %d",a*b);
			break;
		case 'd':
		case 'D':
			printf("Division = %d",a/b);
			break;
		default:
			printf("Invalid Entry.");
	}
	getch();
}
