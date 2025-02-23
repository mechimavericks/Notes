// Program to Implement Bisection Method
#include<stdio.h>
#include<math.h>
#define f(x) (x*x*x-4*x-9)
#define E 0.0001
void main(){
    float a,b,c,f0,f1,f2;
    lbl:
    printf("Enter Two Initial Guess Value: ");
    scanf("%f%f",&a,&b);
    f1=f(a);
    f2=f(b);
    if(f2*f1>=0){
        printf("The Initial Guess Value is not Correct, Please Choose another Guess\n");
        goto lbl;
    }else{
        top:
        c=(a+b)/2;
        f0=f(c);
        if(f0==0){
            printf("The Root is: %f\n",c);
        }
        if(f1*f0<0){
            b=a;
            f2=f0;
        }else{
            a=c;
            f1=f0;
        }
        if(fabs((b-a)/b)<=E){
            printf("The Root is: %f\n",c);
        }else{
            goto top;
        }
    }
}