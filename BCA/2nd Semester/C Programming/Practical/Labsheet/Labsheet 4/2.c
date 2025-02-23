//WAP that finds the sum of odd numbers from 0 to 100.(use do- while loop)
//i.e. sum=1+3+….+99
 #include<stdio.h>
 void main()
 {
 	int i,sum;
 	i=1;
 	sum=0;
	 do
 	{
 		sum=sum+i;
 		i=i+2;
	 }while(i<=100);
	 printf("Sum of Odd Numbers from 0 to 100 = %d",sum);
	 getch();
 }
