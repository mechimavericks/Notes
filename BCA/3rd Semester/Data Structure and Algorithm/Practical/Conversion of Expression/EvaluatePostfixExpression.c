#include<stdio.h>
#include<math.h>
#include<string.h>
#include<ctype.h>
void push(int);
int pop();
int stack[50],tos=-1;
void main(){
	char postfix[50],ch;
	int i,a,b,c,value,result,len;
	printf("Enter a Postfix Expression: ");
	gets(postfix);
	len=strlen(postfix);
	for(i=0;i<len;i++){
		ch=postfix[i];
		if(isalpha(ch)){
			printf("Enter the Value of %c: ",ch);
			scanf("%d",&value);
			push(value);
		}
		else{
			a=pop();
			b=pop();
			switch(ch){
				case '+':
					c=b+a;
					break;
				case '-':
					c=b-a;
					break;
				case '*':
					c=b*a;
					break;
				case '/':
					c=b/a;
					break;
				case '$':
				case '^':
					c=pow(b,a);
					break;
			}
			push(c);
		}
	}
	printf("Result = %d",pop());
}
int pop(){
	int data;
	data = stack[tos];
	tos--;
	return data;
}
void push(int data){
	tos++;
	stack[tos]=data;
}
