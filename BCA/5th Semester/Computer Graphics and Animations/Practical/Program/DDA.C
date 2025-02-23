#include<stdio.h>
#include<conio.h>
#include<math.h>
#include<graphics.h>
void main(){
 int x,y,x0,y0,x1,y1,dx,dy,steps,i,gd=DETECT,gm;
 float xinc,yinc;
 initgraph(&gd,&gm,"C://TURBOC3//BGI");
 printf("Enter the line endpoints:\n");
 scanf("%d %d %d %d",&x0,&y0,&x1,&y1);
 dx=x1-x0;
 dy=y1-y0;
 if(dx>dy)
	steps=abs(dx);
 else
	steps=abs(dy);
 xinc=dx/(float)steps;
 yinc=dy/(float)steps;
 putpixel(x0,y0,WHITE);
 x=x0;
 y=y0;
 for(i=0;i<steps;i++){
	x=x+xinc;
	y=y+yinc;
	putpixel(x,y,WHITE);
	delay(100);
 }
 getch();
}