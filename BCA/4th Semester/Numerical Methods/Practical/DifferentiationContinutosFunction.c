// Program to Implement Numerical Differentiation for Continuous Function.
#include<stdio.h>
#define f(x) (x*x)
void main(){
    float x,h,k,l;
    printf("Enter the Value of x and h: \n");
    scanf("%f%f",&x,&h);
    k=(f(x+h)-f(x-h))/2*h;
    l=(f(x+h)-2*f(x)+f(x-h))/h*h;
    printf("First Derivative: %f\nSecond Derivative: %f",k,l);
}
