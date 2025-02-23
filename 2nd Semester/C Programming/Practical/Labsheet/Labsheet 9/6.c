//WAP to pass a structure to a function.
#include<stdio.h>
struct function{
	int a,b;
}f;
int sum(int x, int y)
{
	return x+y;
}
void main()
{
	printf("Enter the Two Number:\n");
	scanf("%d%d",&f.a,&f.b);
	printf("Sum = %d",sum(f.a,f.b));
	getch();
}
