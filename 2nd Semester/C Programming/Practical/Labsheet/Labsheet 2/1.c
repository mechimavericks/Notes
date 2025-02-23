//WAP to read a 3 digit no. and print each digit separately
#include<stdio.h>
void main()
{
int a,b,c,n;
printf("Enter the 3 Digit Number:- ");
scanf("%d",&n);
c=n%10;
n=n/10;
b=n%10;
n=n/10;
a=n%10;
printf("First Number:%d\nSecond Number:%d\nThird Number:%d\n",a,b,c);
getch();
}
