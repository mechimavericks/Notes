//WAP to print day depending on the number input by user. (Use switch case)
#include<stdio.h>
void main()
{
	int a;
	printf("Enter the Number:- ");
	scanf("%d",&a);
	switch(a)
	{
		case 1:
			printf("Sunday");
			break;
		case 2:
			printf("Monday");
			break;
		case 3:
			printf("Tuesday");
			break;
		case 4:
			printf("Wednesday");
			break;
		case 5:
			printf("Thrusday");
			break;
		case 6:
			printf("Friday");
			break;
		case 7:
			printf("Saturday");
			break;
		default:
			printf("Invalid Entry.");
	}
	getch();
}
