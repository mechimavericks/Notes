#include<conio.h>
#include<stdio.h>
#include<graphics.h>
void main(){
int x0,y0,x1,y1,sx,sy;
int gd=DETECT,gm;
initgraph(&gd,&gm,"C:\\TurboC3\\BGI");
printf("Enter end-points of a line\n");
scanf("%d %d %d %d",&x0,&y0,&x1,&y1);
bar3d(x0,y0,x1,y1,25,1); // Here 25 is depth value and 1 is used for setting flag
printf("Enter scaling factors sx and sy\n");
scanf("%d %d",&sx,&sy);
x0=x0*sx;
y0=y0*sy;
x1=x1*sx;
y1=y1*sy;
bar3d(x0,y0,x1,y1,25,1);
getch();
}