//WAP to read l,b,h of a rectangle and print its volume using all four category of function.
#include<stdio.h>
void volume(int l, int b, int h)
{
	int v;
	v=l*b*h;
	printf("Volume = %d",v);
}
void main()
{
	int l,b,h;
	printf("Ente the Length, breadth and Hegith:- \n");
	scanf("%d%d%d",&l,&b,&h);
	volume(l,b,h);
	getch();
}
