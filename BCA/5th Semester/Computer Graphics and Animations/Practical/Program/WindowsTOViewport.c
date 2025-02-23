#include<stdio.h>
void conversion (float wx1, float wy1, float wx2, float wy2, float vx1, float vy1, float vx2, float vy2, float wx, float wy){
    float sx, sy,tx,ty,vx,vy;
    sx = (vx2-vx1)/(wx2-wx1);
    sy = (vy2-vy1)/(wy2-wy1);
    tx = vx1 - (sx*wx1);
    ty = vy1 - (sy*wy1);
    vx = sx*wx + tx;
    vy = sy*wy + ty;
    printf("The converted point is (%.2f,%.2f)",vx,vy);
    // scanf();
}
int main(){
    float wx1, wy1, wx2, wy2, vx1, vy1, vx2, vy2, wx, wy;
    printf("Enter the window lower left hand coordinates:\n");
    scanf("%f %f",&wx1,&wy1);
    printf("Enter the window upper right hand coordinates:\n");
    scanf("%f %f",&wx2,&wy2);
    printf("Enter the viewport lower left hand coordinates:\n");
    scanf("%f %f",&vx1,&vy1);
    printf("Enter the viewport upper right hand coordinates:\n");
    scanf("%f %f",&vx2,&vy2);
    printf("Enter the window point to be converted:\n");
    scanf("%f %f",&wx,&wy);
    conversion(wx1,wy1,wx2,wy2,vx1,vy1,vx2,vy2,wx,wy);
    return 0;
}