//WAP to read l,b,h of a rectangle and print its volume using all four category of function.
#include<stdio.h>
int volume(int l, int b, int h)
{
	return l*b*h;
}
void main()
{
	int l,b,h;
	printf("Ente the Length, breadth and Hegith:- \n");
	scanf("%d%d%d",&l,&b,&h);
	printf("Volume = %d",volume(l,b,h));
	getch();
}
