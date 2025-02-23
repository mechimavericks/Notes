// WAP to input four no.s and display the greatest no.
#include<stdio.h>
void main()
{
	int a,b,c,d;
	printf("Enter the Four Number:-");
	scanf("%d%d%d%d",&a,&b,&c,&d);
	a = a>b?a:b;
	a = a>c?a:c;
	a = a>d?a:d;
	printf("Greatest Number = %d",a);
	getch();	
//	if(a>b && a>c && a>d)
//	{
//		printf("%d is the Greatest Number.",a);
//	}
//	else if(b>c && c>d){
//		printf("%d is the Greatest Number.",b);
//	}
//	else if(c>d)
//	{
//		printf("%d is the Greatest Number.",c);
//	}
//	else
//	{
//		printf("%d is the Greatest Number.",d);
//	}
}
