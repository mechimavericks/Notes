#include<stdio.h>
int main()
{
    FILE *fp;
    fp=fopen("file.txt","a");
    fprintf(fp,"I am BCA Students.");
    fclose(fp);
    return 0;
}