//Jacobi  Iteration Method
#include <stdio.h>
#include <math.h>
#define f1(x1,x2) ((5-x2)/3)
#define f2(x1,x2) ((5-x1)/-3)
void main(){
    float x1, x2, E, x1new, x2new, e1, e2;
    printf("Enter initial guess : \n");
    scanf("%f%f", &x1,&x2);
    printf("Enter error tolerance : \n");
    scanf("%f", &E);
    do{
    x1new = f1(x1, x2);
    x2new = f2(x1,x2);
    e1 = fabs(x1new - x1);
    e2 = fabs(x2new - x2);
    x1 = x1new;
    x2 = x2new;
    } while(e1>E && e2>E);
    printf("The Result of x1 is %.4f and x2 is %.4f.", x1, x2);
    
}