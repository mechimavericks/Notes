//WAP to input book number,title and price of 5 books and display them in appropriate format.
#include<stdio.h>
#include<string.h>
struct book
{
	int bookno;
	char title[25];
	float price;
}b[5];
void main()
{
	int i;
	printf("Enter the Book No., Title and Price of 5 Books\n");
	for(i=0;i<2;i++)
	{
		printf("Book No[%d] = ",i);
		scanf("%d",&b[i].bookno);
		printf("Book Title[%d] = ",i);
		gets(b[i].title);
		printf("Book Price[%d] = ",i);
		scanf("%f",&b[i].price);
	}
	printf("\nBook No.\tTitle\t\tPrice\n");
	for(i=0;i<2;i++)
		printf("%d\t%s\t%f\n",b[i].bookno,b[i].title,b[i].price);
	getch();
}
