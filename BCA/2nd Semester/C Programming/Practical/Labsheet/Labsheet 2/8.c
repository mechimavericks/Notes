//WAP to input two points A(x1,y1) & B(x2,y2) and find the distance between them. Hint: AB= sqrt [ (x2-x1)2+(y2-y1)2] 
#include<stdio.h>
#include<math.h>
void main()
{
	int x1,x2,y1,y2;
	float dist;
	printf("Enter the value of Two point(x1,y1,x2,y2):- \n");
	scanf("%d%d%d%d",&x1,&y1,&x2,&y2);
	dist = sqrt(pow((x2-x1),2)+pow((y2-y1),2));
	printf("Distance = %.2f",dist);
	getch();
}
