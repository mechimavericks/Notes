#include<stdio.h>
//Shortest Job First(SJF) - Process Scheduling Algorithm

void main(){
	//declare variables
	int p[10],bt[10],wt[10],tat[10],n,i,j,t;
	float awt=0,atat=0;
	
	//input
	printf("Enter the Number of process\n");
	scanf("%d",&n);
	
	printf("Enter Burst Time\n");
	for(i=0;i<n;i++){
		p[i]=i+1;  //inputting process number.
		scanf("%d",&bt[i]);  //burst time input
	}
	
	//sorting and arranging process and burst time
	//sorting on the basis of burst time
	//sorting using selection sort..
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(bt[i]>bt[j]){
				//swapping burst time
				t=bt[i];
				bt[i]=bt[j];
				bt[j]=t;
				
				//arrange process
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
			wt[i]=wt[i]+bt[j];  //bt caluclated
		}
		
	   awt=awt+wt[i];  //total wt calculated	
	}
	
	//calculate turn around time
	for(i=0;i<n;i++){
		tat[i]=wt[i]+bt[i];  //tat caluclated
		
		atat=atat+tat[i];  //total tat calculated
	}
	
	//display
	printf("Process\tBT\tWT\tTAT\n");
	for(i=0;i<n;i++)
		printf("P%d\t%d\t%d\t%d\n",p[i],bt[i],wt[i],tat[i]);
    
    printf("Average Waiting Time=%.2f ms\n Average Turn Around Time=%.2f ms",awt/n,atat/n);
	
}
