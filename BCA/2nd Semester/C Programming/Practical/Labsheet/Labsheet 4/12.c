// WAP to find the leap year between 1900 and 2000
#include<stdio.h>
void main()
{
	int i;
	printf("The Leap year Between 1900 to 2000 are:-\n");
	i=1900;
	do{
		if(i%4==0)
			printf("%d\n",i); 
		i++;
	}while(i<=2000);
	getch();
}
