//Implementation of Gauss Jordan Method
#include<stdio.h>
#include<stdlib.h>
void main(){
		 float a[5][5], x[5], ratio;
		 int i,j,k,n=3;
		 printf("Solution of 3x3 Linear Equation.\nEnter the Value:\n");
		 for(i=1;i<=n;i++){
			  for(j=1;j<=n+1;j++) {
				   printf("a[%d][%d] = ",i,j);
				   scanf("%f", &a[i][j]);
			  }
		 }
		 for(i=1;i<=n;i++){
			  if(a[i][i] == 0) {
				   printf("Mathematical Error!");
				   exit;
			  }
			  for(j=1;j<=n;j++){
				   if(i!=j) {
					    ratio = a[j][i]/a[i][i];
					    for(k=1;k<=n+1;k++)
					     	a[j][k] = a[j][k] - ratio*a[i][k];
				   }
			  }
		 }
		 for(i=1;i<=n;i++)
		  	x[i] = a[i][n+1]/a[i][i];
		 printf("\nResult:\n");
		 for(i=1;i<=n;i++)
		   	printf("x[%d] = %0.3f\n",i, x[i]);
}