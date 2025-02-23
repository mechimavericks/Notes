// Gauss Elimination method
#include<stdio.h>
#include<stdlib.h>
void main(){
	 float a[5][5], x[5], ratio;
	 int i,j,k;
     printf("Solution of 3x3 Linear Equation.\nEnter the Value:\n");
	 for(i=1;i<=3;i++){
		  for(j=1;j<=3+1;j++){
			   printf("a[%d][%d] = ",i,j);
			   scanf("%f", &a[i][j]);
		  }
	 }
	 for(i=1;i<=3-1;i++) {
		  if(a[i][i] == 0){
			   printf("Mathematical Error!");
			   exit;
		  }
		  for(j=i+1;j<=3;j++) {
			   ratio = a[j][i]/a[i][i];			   
			   for(k=1;k<=3+1;k++) {
			  		a[j][k] = a[j][k] - ratio*a[i][k];
			   }
		  }
	 }
	 x[3] = a[3][3+1]/a[3][3];
	 for(i=3-1;i>=1;i--){
		  x[i] = a[i][3+1];
		  for(j=i+1;j<=3;j++){
		  		x[i] = x[i] - a[i][j]*x[j];
		  }
		  x[i] = x[i]/a[i][i];
	 }
	 printf("\nResult:\n");
	 for(i=1;i<=3;i++){
	  	printf("x%d = %0.4f\n",i, x[i]);
	 }
}