// Solve the quadratic equation: Ax2+Bx+C. (print imaginary roots also)

#include<stdio.h>
#include<math.h>
void main()
{
   int a, b, c, d, r1, r2, real, imaginary;

   printf("Enter the value of a, b, and c:- \n");
   scanf("%d%d%d",&a,&b,&c);
   d = (b*b) - 4*a*c; 

   if( d>1 )
   {
     r1 = (-b+sqrt(d)) / 2*a;
     r2 = (-b-sqrt(d)) / 2*a;
     printf("The Solution is X= %d, %d", r1, r2);
   }
   else if(d==0)
   {
     r1 = r2 = -b/2*a;
     printf("The Solution is X= %d, %d", r1, r2);
   }
   else
   {
     real = -b/2*a;
     imaginary = sqrt(d)/2*a;
     printf("The Solution is X = %d + i( %d ), ", real, imaginary);
     printf("%d - i( %d )", real, imaginary);
   }
   getch();
}

