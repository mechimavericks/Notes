#include<stdio.h>
#include<conio.h>
#include<graphics.h>
void symmetry(int x,int y,int xc,int yc){
	putpixel(x+xc,y+yc,GREEN);
	putpixel(-x+xc,y+yc,GREEN);
	putpixel(x+xc,-y+yc,GREEN);
	putpixel(-x+xc,-y+yc,GREEN);
	putpixel(y+yc,x+xc,GREEN);
	putpixel(-y+yc,x+xc,GREEN);
	putpixel(y+yc,-x+xc,GREEN);
	putpixel(-y+yc,-x+xc,GREEN);
	delay(100);
}
void main(){
 int gd=DETECT,gm,x,y,p,r,xc,yc;
 initgraph(&gd,&gm,"C:\\TURBOC3\\BGI");
 printf("Enter a Center and Radius: \n");
 scanf("%d%d%d",&xc,&yc,&r);
 x=0;
 y=r;
 symmetry(x,y,xc,yc);
 delay(100);
 p=1-r;
 do{
	if(p<0){
		x=x+1;
		y=y;
		symmetry(x,y,xc,yc);
		p=p+2*x+1;
	}else{
		x=x+1;
		y=y-1;
		symmetry(x,y,xc,yc);
		p=p+2*x+1-2*y;
	}
 }while(x<y);
 getch();
}














