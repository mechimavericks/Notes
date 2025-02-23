/* WAP to input a line of text then conunt the following with the use of pointer.
i. No of alphabet
ii. No  of vowels
iii. No of consunent
iv. No of digits
v. No of Spaces
vi. No of special characters				*/
#include<stdio.h>
#include<string.h>
void main()
{
	char text[100], *p;
	int alp,vow,cons,dig,spa,spe;
	p=text;
	alp=vow=cons=dig=spa=spe=0;
	printf("Enter the Line of text:\n");
	gets(text);
	while(*p!='\0')
	{
		if(*p=='a'|| *p=='A'|| *p=='e'|| *p=='E' ||*p=='i'|| *p=='I' || *p=='o'|| *p=='O' ||*p=='U'|| *p=='U')
			vow++;
		else if(*p>='a' && *p<='z' || *p>='A' && *p<='Z')
			cons++;
		else if(*p>='0' && *p<='9')
			dig++;
		else if(*p==' ')
			spa++;
		else 
			spe++;
		alp++;
		p++;
	}
	alp = alp - spa;
	printf("Alphabet = %d\nVowels = %d\nConsonant = %d\nDigits = %d\nSpaces = %d\nSpecial Characters = %d\n",alp,vow,cons,dig,spa,spe);
	getch();
}

