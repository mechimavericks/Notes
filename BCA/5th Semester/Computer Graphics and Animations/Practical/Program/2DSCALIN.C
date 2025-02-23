#include<stdio.h>
#include<graphics.h>
void main(){
	int gd=DETECT,gm,x0,y0,x1,y1,sx,sy;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	printf("Enter a End Point of Line:\n");
	scanf("%d%d%d%d",&x0,&y0,&x1,&y1);
	line(x0,y0,x1,y1);
	printf("Enter the XY Scaling Factor: \n");
	scanf("%d%d",&sx,&sy);
	x0*=sx;
	y0*=sy;
	x1*=sx;
	y1*=sy;
	line(x0,y0,x1,y1);
	getch();
}