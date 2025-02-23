//Linear Interpolation 
#include <stdio.h>
// #include <math.h>
 void main()
{
   float f,f1,f2,x,x1,x2;
   printf("Enter The value of x1 & x2:\n");
   scanf("%f%f",&x1,&x2);
   printf("Enter X1 & x2 corresponding Function Value: \n");
   scanf("%f%f",&f1,&f2);
   printf("Enter the Point for Which You Want to Calculate Interpolation: ");
   scanf("%f",&x);
   f=f1+((x-x1)*(f2-f1)/(x2-x1));
   printf("The Required Result is : %.4f",f);
}