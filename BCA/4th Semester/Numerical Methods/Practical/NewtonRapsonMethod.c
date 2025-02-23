//Newton Rapson Iteration Method
#include<stdio.h>
#include<math.h>
#define f(x) (x*x-3*x+2)
#define g(x) (2*x-3)
#define E 0.0001
void main(){
	float x0,g0,f0,x1;
	printf("Enter Initial Guess Value: ");
	scanf("%f",&x0);
	top:
	f0=f(x0);
	g0=g(x0);
	x1=x0-(f0/g0);
	if(fabs((x1-x0)/x1)<=E){
		printf("The Root is: %f",x1);
	}else{
		x0=x1;
		goto top;
	}
}
