#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main(){
 int gd=DETECT,gm;
 initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
// line(10,10,200,10);
// circle(100,100,50);
 ellipse(250,200,0,360,100,50);
 getch();

}