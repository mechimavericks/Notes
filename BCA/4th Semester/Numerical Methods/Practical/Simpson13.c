// Program to Implement Integration using Simpson 1/3 Rule
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
        if(i%2==0)
            m=m+2*f(l);
        else
            o=o+4*f(l);
    }
    res=(f(a)+f(b)+m+o)*h/3;
    printf("Result: %f",res);
}