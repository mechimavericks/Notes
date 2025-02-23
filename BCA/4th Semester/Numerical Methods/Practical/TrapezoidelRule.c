// Program to Implement Integration using Trapezoidel Rule
#include<stdio.h>
#define f(x) (x*x)
void main(){
    float a,b,h,i,l,n;
    printf("Enter the Value of Lower, Upper Limit and No. of Sub Interval:\n");
    scanf("%f%f%f",&a,&b,&n);
    h=(b-a)/n;
    for(i=a+h;i<=b-h;i=i+h)
        l+=(2*f(i));
    printf("Result: %f",((f(a)+f(b))+l));
}