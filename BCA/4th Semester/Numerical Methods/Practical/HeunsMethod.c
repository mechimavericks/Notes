//Heuns Method For Differential Equation  
#include<stdio.h>
#define f(x,y) (2*y/x)
void main(){
	float h,x0,y0,k,y1,n,m1,m2,x1,i;
	printf("Enter the Value of X0 and Y0\n");
	scanf("%f%f",&x0,&y0);
	printf("Enter Step Size H: \n");
	scanf("%f",&h);
	printf("Enter the point value to be Calculated:\n");
	scanf("%f",&n);
	for(i=x0+h;i<=n;i=i+h){
		m1=f(x0,y0);
		k=x0+h;
		m2=f(k,y0+h*f(x0,y0));
		y1=y0+((m1+m2)/2) * h;
		x0=k;
		y0=y1;		
	}
	printf("The Result is %.4f",y1);
}

