//WAP using recursion and pointer that prints the given string in reverse order.
#include <stdio.h>
void reverse() 
{
	char c,*p;
	p=&c;
	scanf("%c",&*p);
    if (*p != '\n') 
 	{
        reverse();
        printf("%c",*p);
    }
}
void main() 
{
    printf("Enter a String: ");
    reverse();
}


