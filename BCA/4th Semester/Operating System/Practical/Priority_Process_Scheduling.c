#include<stdio.h>
//Priority - Process Scheduling Algorithm

void main(){
	//declare variables
	int p[10],bt[10],pr[10],wt[10],tat[10],n,i,j,t;
	float awt=0,atat=0;
	
	//input
	printf("Enter no. of process (Max 10): ");
	scanf("%d",&n);
	
	printf("Enter Burst Time and Priority of Each Process:\n");
	for(i=0;i<n;i++){
		p[i]=i+1;  //inputting process number.
		printf("\nBurst Time of P[%d]:",i+1);
		scanf("%d",&bt[i]);  //burst time input
		printf("Priority of P[%d]:",i+1);
		scanf("%d",&pr[i]);  //inputting prority
	}
	
	//sorting and arranging process,priority and burst time
	//sorting on the basis of priority
	//sorting using selection sort..
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(pr[i]>pr[j]){  
				//swapping priority
				t=pr[i];
				pr[i]=pr[j];
				pr[j]=t;
				
				//arranging burst time
				t=bt[i];
				bt[i]=bt[j];
				bt[j]=t;
				
				//arranging process
				t=p[i];
				p[i]=p[j];
				p[j]=t;
			}
		}
	}
	
	//calculate wating time 
	wt[0]=0; //wt of first process is always zero
	for(i=1;i<n;i++){  //process
		wt[i]=0;     
		for(j=0;j<i;j++){  //for getting burst time 
			wt[i]=wt[i]+bt[j];  //wt caluclated
		}
		
	   awt=awt+wt[i];  //total wt calculated	
	}
	
	//calculate turn around time
	for(i=0;i<n;i++){
		tat[i]=wt[i]+bt[i];  //tat caluclated
		
		atat=atat+tat[i];  //total tat calculated
	}
	
	//display
	printf("\nProcess\tBT\tPR\tWT\tTAT\n");
	for(i=0;i<n;i++)
		printf("P%d\t%d\t%d\t%d\t%d\n",p[i],bt[i],pr[i],wt[i],tat[i]);
    
    printf("Average Waiting Time=%.2f ms\n",awt/n);
    printf("Average Turn Around Time=%.2f ms\n",atat/n);
}
