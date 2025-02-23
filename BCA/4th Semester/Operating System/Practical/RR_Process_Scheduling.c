//Round Robin Process Scheduling
#include<stdio.h>
#include<stdbool.h>
void main()
{
    int n,p[10],bt[10],wt[10],tat[10],i,j,quantum,rem_bt[10];
    float awt=0,atat=0;
    printf("Enter total number of processes(Max 10): ");
    scanf("%d",&n);
    printf("\nEnter Process Burst Time\n");
    for(i=0;i<n;i++){
        p[i]=i+1;   //contains process number
        scanf("%d",&bt[i]);
        //setting bt as remaining bt initially
        rem_bt[i]=bt[i];
    }
    printf("\nEnter Time Quantum:");
    scanf("%d",&quantum);
    
    //calculating waiting time
        int t = 0; // setting current time
    	 //keep traversing in round robin manner
    	 //until all process are done
        while(1){
        	bool done=true;
        	//Traverse all processes one by one repeatedly
	    	for(i=0;i<n;i++)
	    	{
	    		//check if process burst time is remaining
	    		//then only need to process further
	    		if(rem_bt[i]>0){
	    			done=false;  //process is pending
		    		if(rem_bt[i]>quantum){
		    			t += quantum;   //increase the time
						rem_bt[i] -= quantum; //decrease remaining bt
					}else{
						t=t+rem_bt[i];
						wt[i]=t-bt[i];
						//as process is fully executed
						//set remaining bt as 0
						rem_bt[i]=0;	
					}
				}
			} 
			//if all process are done
			if(done==true)
				break;   		
		}
   
    printf("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time");
    //calculating turnaround time
    for(i=0;i<n;i++)
    {
       tat[i]=bt[i]+wt[i];
       awt=awt+wt[i];
       atat=atat+tat[i];
       printf("\nP%d\t\t%d\t\t%d\t\t%d",p[i],bt[i],wt[i],tat[i]);
    }   
    
    printf("\nAverage Waiting Time=%.2f",awt/n);
    printf("\nAverage Turnaround Time=%.2f",atat/n);
    
}

