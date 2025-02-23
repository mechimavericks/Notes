//RK Foruth Order Method For Differential Equation  
#include<stdio.h>
#define f(x,y) (x/y)
void main(){
	float h,x0,y0,k,y1,n,m1,m2,m3,m4,x1,i;
	printf("Enter the Value of X0 and Y0\n");
	scanf("%f%f",&x0,&y0);
	printf("Enter Step Size H: \n");
	scanf("%f",&h);
	printf("Enter the point value to be Calculated:\n");
	scanf("%f",&n);
	for(i=x0+h;i<=n;i=i+h){
		m1=f(x0,y0);
		k=h/2;
		m2=f(x0+k,y0+m1*k);
		m3=f(x0+k,y0+m2*k);
		m4=f(x0+1,y0+2*m3*h);
		y1=y0+((m1+m2+m3+m4)/6) * h;
		x0=x0+h;
		y0=y1;		
	}
	printf("The Result is %f",y1);
}