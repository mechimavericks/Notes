/*  program to enter 10 number into the file of number.txt  */
#include<stdio.h>
void main()
{
	int i,n;
	FILE *fp;
	printf("Enter 10 Numbers:- \n");
	fp=fopen("number.txt","a");
	for(i=0;i<10;i++)
	{
		scanf("%d",&n);
		fprintf(fp,"%d\n",n);
	}
	fclose(fp);
	printf("Writing process Completed.");
	getch();
}
