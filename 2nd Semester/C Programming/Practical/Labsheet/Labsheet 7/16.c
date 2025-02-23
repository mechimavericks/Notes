//WAP to find total number of vowels present in the string.
#include<stdio.h>
void main()
{
	char text[100], *p;
	int vow;
	p=text;
	vow=0;
	printf("Enter the Line of text:\n");
	gets(text);
	while(*p!='\0')
	{
		if(*p=='a'|| *p=='A'|| *p=='e'|| *p=='E' ||*p=='i'|| *p=='I' || *p=='o'|| *p=='O' ||*p=='u'|| *p=='U')
			vow++;
		p++;	
	}
	printf("Total Number of Vowels = %d",vow);
	getch();
}
