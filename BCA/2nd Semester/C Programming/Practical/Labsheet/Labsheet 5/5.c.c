//WAP to read l,b,h of a rectangle and print its volume using all four category of function.
#include<stdio.h>
int volume()
{
	int l,b,h,v;
	printf("Ente the Length, breadth and Hegith:- \n");
	scanf("%d%d%d",&l,&b,&h);
	v=l*b*h;
	return v;
}
void main()
{
	int vol;
	vol = volume();
		printf("Volume = %d",vol);
	getch();
}
