#include<conio.h>
#include<stdio.h>
#include<graphics.h>
void main(){
	int x0,y0,x1,y1,tx,ty;
	int gd=DETECT,gm;
	initgraph(&gd,&gm,"C:\\TurboC3\\BGI");
	printf("Enter end-points of a line\n");
	scanf("%d %d %d %d",&x0,&y0,&x1,&y1);
	bar3d(x0,y0,x1,y1,25,1); //here 25 is depth and 1 is used for setting top flag.
	printf("Enter translation factors tx and ty\n");
	scanf("%d %d",&tx,&ty);
	x0=x0+tx;
	y0=y0+ty;
	x1=x1+tx;
	y1=y1+ty;
	bar3d(x0,y0,x1,y1,25,1);
	getch();
}