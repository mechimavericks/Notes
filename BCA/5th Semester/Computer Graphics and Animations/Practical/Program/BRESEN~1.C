#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void main(){
  int x0,y0,x1,y1,p0,dx,dy,p,i,x,y,gd=DETECT,gm;
  initgraph(&gd,&gm,"C://TURBOC3/BGI");
  printf("Enter line end points:\n");
  scanf("%d%d%d%d",&x0,&y0,&x1,&y1);
  dx=x1-x0;
  dy=y1-y0;
  x=x0;
  y=y0;
  putpixel(x,y,WHITE);
  p=2*dy-dx;
  for(i=0;i<dx;i++){
    if(p<0){
      x=x+1;
      putpixel(x,y,WHITE);
      p=p+2*dy;
    }
    else{
      x=x+1;
      y=y+1;
      putpixel(x,y,WHITE);
      p=p+2*dy-2*dx;
    }
    delay(100);
  }
  getch();
}