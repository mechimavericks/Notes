#include<stdio.h>
void main()
{
    int nf, np, frame[10], page[30], temp[10];
    int flag1, flag2, flag3, i, j, k, pos, max, pfcount = 0;
    printf("Enter number of frames: ");
    scanf("%d", &nf);
    
    printf("Enter number of pages: ");
    scanf("%d", &np);
    
    printf("Enter page reference string: ");
    
    for(i = 0; i < np; i++){
        scanf("%d", &page[i]);
    }
    
    for(i = 0; i <  nf; i++){
        frame[i] = -1;   //setting all frame values -1 initially
    }
    
    //scanning all pages
    for(i = 0; i < np; i++){
        //setting both flag as 0
        flag1 = flag2 = 0;
        
        //scanning all frames
        for(j = 0; j < nf; j++){
            //cheking page available in frame or not
            if(frame[j] == page[i]){
                   //no need to replace simply skip
                   flag1 = flag2 = 1;
                   break;
               }
        }
        
        //checking flag1
        if(flag1 == 0){
            //scanning all frames
            for(j = 0; j < nf; j++){
                //checking frame empty or not
                if(frame[j] == -1){
                    pfcount++;
                    frame[j] = page[i];
                    flag2 = 1;
                    break;
                }
            }
        }
        
        //frame not empty, now we need to replace page
        if(flag2 == 0){
         //logic for replacing page
         flag3 =0;
        
            for(j = 0; j < nf; j++){
             temp[j] = -1;
            
             for(k = i + 1; k < np; k++){
             if(frame[j] == page[k]){
             temp[j] = k;
             break;
             }
             }
            }
            
            for(j = 0; j < nf; j++){
             if(temp[j] == -1){
             pos = j;
             flag3 = 1;
             break;
             }
            }
            
            if(flag3 ==0){
             max = temp[0];
             pos = 0;
            
             for(j = 1; j < nf; j++){
             if(temp[j] > max){
             max = temp[j];
             pos = j;
             }
             }
            }
            frame[pos] = page[i];
            pfcount++;
        }
        
        printf("\n");
        //printing all frame values
        for(j = 0; j < nf; j++){
            printf("%d\t", frame[j]);
        }
    }
    
    printf("\n\nTotal Page Faults = %d", pfcount);
    
}