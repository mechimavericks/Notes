//Shortest Seek Time First (SSTF)
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int RQ[100],i,n,TotalHeadMoment=0,initial,count=0;
    printf("Enter the number of Requests\n");
    scanf("%d",&n);
    printf("Enter the Requests sequence\n");
    for(i=0;i<n;i++)
     scanf("%d",&RQ[i]);
    printf("Enter initial head position\n");
    scanf("%d",&initial);
    
    // logic for sstf disk scheduling
    
   /* loop will execute until all process is completed*/
    while(count!=n)
    {
        int min=1000,distance,index;
        for(i=0;i<n;i++)
        {
           distance=abs(RQ[i]-initial);
           if(min>distance)
           {
               min=distance;
               index=i;
           }
        }
        TotalHeadMoment=TotalHeadMoment+min;
        initial=RQ[index];
        //printing movement
        printf("%d->",initial);
        // 1000 is for max
        // you can use any number
        RQ[index]=1000;
        count++;
    }
    
    printf("\nTotal head movement is %d",TotalHeadMoment);
}
