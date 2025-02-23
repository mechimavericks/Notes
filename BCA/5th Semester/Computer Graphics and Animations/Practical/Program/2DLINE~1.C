#include<stdio.h>
#include<graphics.h>
#include<conio.h>
void main(){
	int gd=DETECT,gm;
	int x0,y0,x1,y1,tx,ty;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	printf("Enter the End Point of a Line: \n");
	scanf("%d%d%d%d",&x0,&y0,&x1,&y1);
	line(x0,y0,x1,y1);
	printf("Enter a Translation Factor: \n");
	scanf("%d%d",&tx,&ty);
	x0+=tx;
	y0+=ty;
	x1+=tx;
	y1+=ty;
	line(x0,y0,x1,y1);
	getch();

}