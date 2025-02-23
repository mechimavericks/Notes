//Fixed Point Iteration Method
#include<stdio.h>
#include<math.h>
#define f(x) (x*x+x-2)
#define g(x) (2-x*x)
#define E 0.0001
void main(){
	float x0,g0,f0,x1;
	printf("Enter Initial Guess Value: ");
	scanf("%f",&x0);
	top:
	x1=g(x0);
	if(fabs((x1-x0)/x1)<=E){
		printf("The Root is: %f",x1);
	}else{
		x0=x1;
		goto top;
	}
}
