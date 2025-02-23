#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>
#include<stdlib.h>
void push(char);
char pop(void);
int isoperator(char);
int isprecedence(char);
void InfixToPostfix(char[], char[]);
char stack[50];
int tos=-1;
void push(char data){
	tos++;
	stack[tos]=data;
}
char pop(){
	char data;
	data=stack[tos];
	tos--;
	return(data);
}
int isoperator(char symbol){
	if(symbol == '^' || symbol == '$' || symbol == '*' || symbol == '/' || symbol == '+' || symbol == '-')
		return(1);
	else
		return(0);
}
int precedence(char symbol){
	if(symbol == '^' || symbol == '$')
		return(3);	
	if(symbol == '*' || symbol == '/')
		return(2);	
	if(symbol == '+' || symbol == '-')
		return(1);	
	else
		return(0);	
}

void InfixToPostfix(char infix[], char postfix[]){
	int i=0,j=0;
	char scan_el,x,op;
	push('(');							
	strcat(infix,")");					
	scan_el=infix[i];
	while(scan_el != '\0'){
		if(isalpha(scan_el)){
			postfix[j]=scan_el;
			j++;
		}else if(scan_el == '('){
			push(scan_el);
		}else if(isoperator(scan_el)==1){
			op=pop();
			while(isoperator(op)==1 && precedence(op)>= precedence(scan_el))			{
				postfix[j]=op;
				j++;
				op=pop();
			}			
			push(op);
			push(scan_el);			
		}else if(scan_el==')'){
			x=pop();
			while(x != '('){
				postfix[j]=x;
				j++;
				x=pop();
			}
		}else{
			printf("\nInvalid infix expression");
			exit(0);
		}
		i++;
		scan_el=infix[i];
	}	
	if(tos>0){
		printf("\nInvalid infix expression");
		exit(0);
	}	
	postfix[j]='\0';
}
void main(){
	char postfix[50], infix[50];
	printf("\nInput the valid infix expression:");
	gets(infix);
	InfixToPostfix(infix,postfix);
	printf("\nThe Postfix Expression is: ");
	puts(postfix);
	getch();
}


























