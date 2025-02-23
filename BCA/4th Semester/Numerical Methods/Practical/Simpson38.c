// Program to Implement Integration using Simpson 3/8 Rule
#include<stdio.h>
#define f(x) (x*x)
void main(){
    float a,b,n,h,l,m,o,res;
    int i;
    printf("Enter the Value of Lower Limit, Upper Limit and No. of Sub Interval:\n");
    scanf("%f%f%f",&a,&b,&n);
    h=(b-a)/n;
    for(i=1;i<=n-1;i++){
        l=a+i*h;
        if(i%3==0)
            m=m+2*f(l);
        else
            o=o+3*f(l);
    }
    res=(f(a)+f(b)+m+o)*(3*h/8);
    printf("Result: %f",res);
}