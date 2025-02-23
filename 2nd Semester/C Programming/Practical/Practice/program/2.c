/* WAP to read the number from number.txt file and print in even.txt and odd.txt if odd and even and display odd and even number.  */
#include<stdio.h>
void main()
{
	int n;
	FILE *fp,*fp1,*fp2;
	fp=fopen("number.txt","r");
	fp1=fopen("even.txt","w");
	fp2=fopen("odd.txt","w");
	while(fscanf(fp,"%d\n",&n)!=EOF)
	{
		if(n%2==0)
			fprintf(fp1,"%d\n",n);
		else
			fprintf(fp2,"%d\n",n);	
	}
	fclose(fp);
	fclose(fp1);	
	fclose(fp2);
	printf("\nNumber are distributed to Odd and Even file.\n");
	fp1=fopen("even.txt","r");
	printf("\nEven Number\n");
	while(fscanf(fp1,"%d\n",&n)!=EOF)
		printf("%d\n",n);
	printf("Even Read Completed.\n");
	fclose(fp1);
	fp2=fopen("odd.txt","r");
	printf("\nOdd Number\n");
	while(fscanf(fp1,"%d\n",&n)!=EOF)
		printf("%d\n",n);
	printf("Odd Read Completed.");
	fclose(fp2);
	getch();
}
