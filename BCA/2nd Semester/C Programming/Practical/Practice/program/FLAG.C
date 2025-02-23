/*
=========================
I have use some simple features which is available in C to design the flag
of Nepal.
By Santosh Bhandari
==========================   */
#include<graphics.h>
#include<conio.h>
void main()
{
int gd=DETECT,gm;
int poly[]={100,100,250,150,120,200,250,250,100,300,100,400,90,400,90,97,100,100};
int poly1[]={90,88,270,150,140,200,270,250,90,312};
initgraph(&gd,&gm,"c:\\TurboC3\\BGI");
drawpoly(5,poly1);
setfillstyle(1,BLUE);
fillpoly(5,poly1);
drawpoly(9,poly);
setfillstyle(1,RED);
fillpoly(9,poly);
setfillstyle(1,WHITE);
circle(140,250,20);
floodfill(140,250,WHITE);
//arc(140,145,180,360,20);
//line(120,145,160,145);
ellipse(140,145,180,360,20,10);
ellipse(140,145,180,360,20,20);
floodfill(130,158,WHITE);
setcolor(GREEN);
settextstyle(8,0,6);
outtextxy(90,410,"Flag of Nepal");
setcolor(YELLOW);
outtextxy(0,0,"By Santosh Bhandari");
getch();
closegraph();
}