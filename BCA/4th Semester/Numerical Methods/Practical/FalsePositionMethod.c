// Program to Implement False Position Method
#include<stdio.h>
#include<math.h>
#define f(x) (x*x-x-2)
#define E 0.0001
void main(){
    float x0,x1,x2,f0,f1,f2;
    lbl:
    printf("Enter Two Initial Guess Value: ");
    scanf("%f%f",&x1,&x2);
    f1=f(x1);
    f2=f(x2);
    if(f2*f1>=0){
        printf("The Initial Guess Value is not Correct, Please Choose another Guess\n");
        goto lbl;
    }else{
        top:
        x0=(x1-((f1*(x2-x1))/(f2-f1)));
        f0=f(x0);
        if(f0==0){
            printf("The Root is: %f\n",x0);
        }
        if(f1*f0<0){
            x2=x0;
        }else{
            x1=x0;
        }
        if(fabs((x2-x1)/x2)<=E){
            printf("The Root is: %f\n",x0);
        }else{
            goto top;
        }
    }
}