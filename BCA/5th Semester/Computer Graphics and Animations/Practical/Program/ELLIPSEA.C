#include<stdio.h>
#include<conio.h>
#include<graphics.h>

void symmetry(int x, int y, int xc, int yc){
    putpixel(x+xc, y+yc, 15);
    putpixel(-x+xc, y+yc, 15);
    putpixel(x+xc, -y+yc, 15);
    putpixel(-x+xc, -y+yc, 15);
    delay(100);
}

void main(){
    int gd = DETECT, gm, x, y, p1, p2, rx, ry, xc, yc;
    initgraph(&gd, &gm, "C:\\TURBOC3\\BGI");
    printf("Enter the center and X Y radius: \n");
    scanf("%d %d %d %d", &xc, &yc, &rx, &ry);
    x = 0;
    y = ry;
    p1 = ry * ry - rx * rx * ry + (1.0/4) * rx * rx;

    while (2 * ry * ry * x < 2 * rx * rx * y) {
	if (p1 < 0) {
	    x = x + 1;
	    p1 = p1 + 2 * ry * ry * x + ry * ry;
	} else {
	    x = x + 1;
	    y = y - 1;
	    p1 = p1 + 2 * ry * ry * x + ry * ry - 2 * rx * rx * y + rx * rx;
	}
	symmetry(x, y, xc, yc);
    }

    p2 = ry * ry * (x + 1.0/2) * (x + 1/2) + rx * rx * (y - 1) * (y - 1) - rx * rx + ry * ry;

    while (y > 0) {
	if (p2 > 0) {
	    x = x;
	    y = y - 1;
	    p2 = p2 + rx * rx - 2 * rx * rx * y;
	} else {
	    x = x + 1;
	    y = y - 1;
	    p2 = p2 + rx * rx - 2 * rx * rx * y + 2 * ry * ry * x;
	}
	symmetry(x, y, xc, yc);
    }
    
    getch();
}
