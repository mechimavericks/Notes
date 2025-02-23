#include<stdio.h>
#include<graphics.h>
#include<conio.h>
#include<math.h>
void main(){
	int gd=DETECT,gm;
	int x0,y0,x1,y1,deg;
	initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
	printf("Enter the End Point of a Line: \n");
	scanf("%d%d%d%d",&x0,&y0,&x1,&y1);
	line(x0,y0,x1,y1);
	printf("Enter a Degree for the Rotation: \n");
	scanf("%d",&deg);
	deg=deg*(3.1415/180);
	x0=(int) abs(x0*cos(deg)-y0*sin(deg));
	y0=(int) abs(y0*cos(deg)+x0*sin(deg));
	x1=(int) abs(x1*cos(deg)-y1*sin(deg));
	y1=(int) abs(y1*cos(deg)+x1*sin(deg));
	line(x0,y0,x1,y1);
	getch();
}