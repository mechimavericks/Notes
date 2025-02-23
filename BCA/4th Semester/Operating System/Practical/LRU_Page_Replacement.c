#include<stdio.h>

//finding least recently used in past...
int findLRU(int duration[],int n){
    int i,pos=0,min=duration[0];
    for(i=1;i<n;i++){
        if(duration[i]<min){
            min=duration[i];
            pos=i;
        }
    }
    return pos;
}

void main(){
    int page[20],frame[10],pfcount=0,np,nf;
    int i,j,flag1,flag2;
    float pfrate;
    int count=0,duration[20],pos;
    
    printf("Enter no. of frames: \n");
    scanf("%d",&nf);
    printf("Enter no. of pages:\n");
    scanf("%d",&np);
    printf("Enter reference string:\n");
    for(i=0;i<np;i++){
        scanf("%d",&page[i]);
    }
    
    //putting -1(blank) initially in all frames
    for(i=0;i<nf;i++)
        frame[i]=-1;
    
    //printing headings
    printf("Ref String\tFrames\n");
    for(i=0;i<np;i++){
        //printring all pages
        printf("%d\t\t\t",page[i]);
        
        /*setting both flag initially as 0
          flag1 - used for checking frame empty or not
          flag2 - used for checking frame empty and page available or not
        */
        flag1=flag2=0;
        
        //scanning all frames
        for(j=0;j<nf;j++){
            //checking page is on the frame or not
            if(frame[j]==page[i]){   //available
                //No page fault
                count++;
                duration[j]=count;
                flag1=flag2=1;
                break;
            }
            
            //checking frame empty or not
            if(flag1==0 && frame[j]==-1){  //frame is empty
                count++;
                pfcount++;
                frame[j]=page[i];
                duration[j]=count;
                flag2=1;
                break;
            }
        }  //end of j loop
            
        //replacing the page
        if(flag2==0){
            pos=findLRU(duration, nf);
            count++;
            pfcount++;
            frame[pos]=page[i];
            duration[pos]=count;
        }
        
        //printing frame values
        for(j=0;j<nf;j++)
            printf("%d\t",frame[j]);
        printf("\n");
    }

    printf("\nTotal Page Fault=%d",pfcount);
    pfrate=(float)pfcount/(float)np;
    printf("\nPage Fault(Miss) Ratio=%.2f",pfrate*100);
}
