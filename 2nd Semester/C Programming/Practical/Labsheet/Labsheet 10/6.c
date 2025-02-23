//WAP to make a record and put it into a file and display on screen
#include<stdio.h>
void main()
{
	int n,i,sn,mark;
	char name[25];
	FILE *fp;
	printf("How many record You want to Enter: ");
	scanf("%d",&n);
	fp=fopen("details.txt","w");
	printf("Enter the S.N., Name and Mark\n");
	for(i=0;i<n;i++)
	{
		scanf("%d%s%d",&sn,&name,&mark);
		fprintf(fp,"%d\t%s\t%d\n",sn,name,mark);
	}
	fclose(fp);
	fp=fopen("details.txt","r");
	printf("S.N.\tName\tMark\n");
	while(fscanf(fp,"%d%s%d",&sn,&name,&mark)!=EOF)
		printf("%d\t%s\t%d\n",sn,name,mark);
	fclose(fp);
	getch();
}
