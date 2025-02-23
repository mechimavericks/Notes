#include<stdio.h>
int Check(int num, int n){
	if(n==0 || n==1)
		return 0;
	else if(num%n==0)
		return 1;
	else
		return Check(num,n-1);
}
void main(){
	int n;
	printf("Enter a Number: ");
	scanf("%d",&n);
	if(Check(n,n-1)==0)
		printf("%d is a Prime Number.",n);
	if(Check(n,n-1)==1)
		printf("%d is not a Prime Number.",n);
//		int i,a=0;
//		for(i=2;i<n;i++){
//			if(n%i==0){
//				a++;
//				break;
//			}
//		}
//		if(a==1)
//			printf("NOt Prime Number.");
//		else 
//			printf("Prime Number.");		
}
