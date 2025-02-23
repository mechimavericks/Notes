#include<conio.h>
#include<stdio.h>
#include<math.h>
#include<graphics.h>
void main(){
float x0,y0,x1,y1,r;
int gd=DETECT,gm,xmid,ymid;
initgraph(&gd,&gm,"C:\\TurboC3\\BGI");
printf("Enter end-points of a line\n");
scanf("%f %f %f %f",&x0,&y0,&x1,&y1);
bar3d(x0,y0,x1,y1,25,1); //here 25 is depth and 1 is used for setting top flag.
printf("Enter rotation angle\n");
scanf("%f",&r);
r=r*(3.1415/180);
xmid=(int)(x0+x1)/2;
ymid=(int)(y0+y1)/2;
x0=abs(x0*cos(r)-y0*sin(r));
y0=abs(y0*cos(r)+x0*sin(r));
x1=abs(x1*cos(r)-y1*sin(r));
y1=abs(y1*cos(r)+y1*sin(r));
bar3d(xmid+x0,ymid+y0,xmid+x1,ymid+y1,25,1); //rotation about xmid and ymid
getch();
}