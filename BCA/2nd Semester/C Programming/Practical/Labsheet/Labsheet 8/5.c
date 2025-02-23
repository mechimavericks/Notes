//WAP to read a line of text & count the no. of words & characters in the line.
#include<stdio.h>
void main()
{
	int i,w=0;
	char text[50];
	printf("Enter the Line of Text:\n");
	gets(text);
	for(i=0;text[i]!='\0';i++)
		if(text[i]== ' ')
			w++;
	printf("Character: %d\n",i-w);
	printf("Word: %d",w+1);
	getch();
}
