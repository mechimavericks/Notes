#include<stdio.h>
void main(){
	int i,j,rows;
	printf("Enter te Number of Rows:\n");
	scanf("%d",&rows);
	for(i=rows/2;i<=rows;i+=2){
		for(j=1;j<rows-i;j+=2){
			printf(" ");
		}
		for(j=1;j<=i;j++){
			printf("*");
		}
		for(j=1;j<=rows-i;j++){
			printf(" ");
		}
		for(j=1;j<=i;j++){
			printf("*");
		}
		printf("\n");
	}
	for(i=rows;i>=1;i--){
		for(j=i;j<rows;j++){
			printf(" ");
		}
		for(j=1;j<=(i*2)-1;j++){
			printf("*");
		}
		printf("\n");
	}
}
