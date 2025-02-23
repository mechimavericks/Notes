//The program is not completed and it's error
/* WAP to calculate: 
a. (a + b) / (c + d) 
b. v(a b) / ( c + d )
c. ( (a-b) /(c*c*d) )
d. ( ( a + b ) / c ) / ( a-( b / d ) )      */


#include<stdio.h>
#include<math.h>
void main()
{
	int a,b,c,d;
	float e,f,g,h;
	printf("Enter the Value of a,b,c and d:- \n");
	scanf("%d%d%d%d",&a,&b,&c,&d);
	e=(a+b)/(c+d);
	f=sqrt((a*b)/(c+d));
	g=(a-b)/(c*c*d);
	h=((a+b)/c)/(a-(b/d));
	printf("The Result are:- \n");
	printf("(a + b) / (c + d) = %.2f \n v(a*b) / ( c + d ) = %.2f \n( (a-b) /(c*c*d)) = %.2f \n((a+b)/c) / (a-(b/d )) = %.2f ",e,f,g,h);
	getch();
}
