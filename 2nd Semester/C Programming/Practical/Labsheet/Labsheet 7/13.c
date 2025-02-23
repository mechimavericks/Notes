//WAP to count vowels and constants in a line of text using pointer.
#include<stdio.h>
void main()
{
	char text[100], *p;
	int vow,cons;
	p=text;
	vow=cons=0;
	printf("Enter the Line of text:\n");
	gets(text);
	while(*p!='\0')
	{
		if(*p=='a'|| *p=='A'|| *p=='e'|| *p=='E' ||*p=='i'|| *p=='I' || *p=='o'|| *p=='O' ||*p=='u'|| *p=='U')
			vow++;
		else if (*p>='a' && *p<='z' || *p>='A' && *p<='Z')
			cons++;
		p++;
	}
	printf("Vowels = %d\nConsonant = %d\n",vow,cons);
	getch();
}
