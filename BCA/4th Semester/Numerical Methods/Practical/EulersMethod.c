//Eulers Method FOR Differential Equation  
#include<stdio.h>
#define f(x,y) (3*x*x+1)
void main(){
	float h,x0,y0,y1,n;
	float i;
	printf("Enter the Value of X0 and Y0\n");
	scanf("%f%f",&x0,&y0);
	printf("Enter Step Size H: \n");
	scanf("%f",&h);
	printf("Enter the point value to be Calculated:\n");
	scanf("%f",&n);
	for(i=x0+h;i<=n;i=i+h){
		y1=y0+h*f(x0,y0);
		x0=h+x0;
		y0=y1;		
	}
	printf("The Result is %.4f",y1);
}
