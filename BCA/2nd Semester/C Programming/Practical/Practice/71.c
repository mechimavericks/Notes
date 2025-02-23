/*     WAP to input ID, Name adn Marks of a Student into the memory and display it in appropriate format using DMA Function 
with structure variable     */
#include<stdio.h>
#include<stdlib.h>
struct student
{
	int id;
	char *name;
	float marks;
}*p;
void main()
{
	int i,n;
	printf("How many data you want to insert:- ");
	scanf("%d",&n);
	p=(struct student*) malloc(n*sizeof(struct student));
	printf("Enter ID, Name and Marks of %d Student:\n",n);
	for(i=0;i<n;i++)
	{
		printf("ID:-");
		scanf("%d",&(p+i)->id);
		printf("Name:-");
		scanf("%s",(p+i)->name);
		printf("Marks:-");
		scanf("%f",&(p+i)->marks);
	}
	printf("ID\tName\tMarks\n");
	for(i=0;i<n;i++)
		printf("%d\t%s\t%f\n",(p+i)->id,(p+i)->name,(p+i)->marks);
	getch();	
}
