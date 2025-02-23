#include<stdio.h>

void main(){
    int page[20],frame[10],pfcount=0,np,nf;
    int i,j,k=0,available;
    float pfrate;
    
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
        printf("%d\t\t",page[i]);
        
        available=0;
        //scanning frames
        for(j=0;j<nf;j++){
            //checking page is in frame or not
            if(page[i]==frame[j]){
                available=1;
                printf("No Replacement\n");
                break;
            }
            
            if(available==0){ //not available in frame, page fault
                //Replacing page now
                frame[k]=page[i];
                k=(k+1)%nf;  //calculate frame no. for next replacement
                pfcount++;
                //printing frame values
                for(j=0;j<nf;j++)
                    printf("%d\t",frame[j]);
                printf("\n");
            }
        }
    }
    printf("\nTotal Page Fault=%d",pfcount);
    pfrate=(float)pfcount/(float)np;
    printf("\nPage Fault(Miss) Ratio=%.2f",pfrate*100);
    
}