/*   WAP to accept 100 numbers from user and store them in odd.txt(if number is odd) or even.txt(if number is even) then display
numbers reading from odd.dat file.     */
#include<stdio.h>
void main()
{
	int i,n;
	FILE *odd,*even;
	printf("Enter the 100 Numers:\n");
	odd=fopen("even.txt","w");
	even=fopen("odd.txt","w");
	for(i=0;i<10;i++)
	{
		scanf("%d",&n);
		if(n%2==0)
			fprintf(odd,"%d\n",n);		
		else
			fprintf(even,"%d\n",n);
	}
	fclose(odd);
	fclose(even);
	printf("Odd and even Write completed.\n\n");
	odd=fopen("odd.txt","r");
	even=fopen("even.txt","r");
	printf("Even Number are:-\n");
	while(fscanf(even,"%d\n",&n)!=EOF)
		printf("%d\n",n);
	printf("Even Read Complete.\nOdd Number are:-\n");
	while(fscanf(odd,"%d\n",&n)!=EOF)
		printf("%d\n",n);
	printf("\nOdd Number read complete.");
	fclose(odd);
	fclose(even);
	getch();	
}
