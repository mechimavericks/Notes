//WAP to read l,b,h of a rectangle and print its volume using all four category of function.
#include<stdio.h>
void volume()
{
	int l,b,h;
	printf("Ente the Length, breadth and Hegith:- \n");
	scanf("%d%d%d",&l,&b,&h);
	printf("Volume = %d",l*b*h);
}
void main()
{
	volume();
	getch();
}
