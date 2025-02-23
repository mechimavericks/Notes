//FCFS Scheduling Algorithm
#include <stdio.h>

void main() {
   //variables declaration
   //input - process no, BT
   //processing - WT, TAT, AWT, ATAT
   int p[10],bt[10],n,i,j,wt[10],tat[10];
   float awt=0,atat=0;

   printf("Enter Number of process (Max 10): ");
   scanf("%d",&n);

   //entering process no. and burst time
   printf("\nEnter process burst time:\n");
   for(i=0;i<n;i++){
       p[i]=i+1;   // p[0]= 1   p[1]=2  p[2]=3
       //scanf("%d",&p[i]);
       scanf("%d",&bt[i]);
   }
    
    //processing and calculating WT,TAT
    //calculating waiting time
    wt[0]=0; //wating time of first process is always 0
    for(i=1;i<n;i++){   //for calculating wt of process
        //we need to add bt of all previous processes
        //scan all previous process
        wt[i]=0;  //set 0 initally
        for(j=0;j<i;j++)  //for scanning and getting bt of previous processes.
            wt[i]=wt[i]+bt[j];  //wt calculated
        
        //calculating average
        awt=awt+wt[i];
    }
    
    //calculating TAT
    for(i=0;i<n;i++){
        tat[i]=wt[i]+bt[i];
        //calculating average
        atat=atat+tat[i];
    }
    
    //displaying data
    printf("\nProcess\t\tBT\tWT\tTAT\n");
    for(i=0;i<n;i++)
        printf("P%d\t\t%d\t%d\t%d\t\n",p[i],bt[i],wt[i],tat[i]);
    
    //diplaying Average
    printf("\nAWT=%.2f",awt/n);
    printf("\nATAT=%.2f",atat/n);
    
}