#include<stdio.h>

void main()
{
	int allocation[10][5],max[10][5],need[10][5],available[10],finish[10],sq[10];
                  //res   //pro
	int n,m,i,j,k,count,count1=0;
	
 	printf("Enter the no of processes : ");
    scanf("%d", &n);

    printf("\nEnter the no of resource type : ");
    scanf("%d", &m);

    printf("\n\nEnter the Max Matrix for each process : ");
    for(i = 0; i < n; i++)
    {
        printf("\nFor process %d : \n", i+1);
        for(j = 0; j < m; j++)
            scanf("%d", &max[i][j]);
    }

    printf("\nEnter the allocation for each process : ");
    for(i = 0; i < n; i++)
    {
        printf("\nFor process %d : \n",i+1);
        for(j = 0; j < m; j++)
            scanf("%d", &allocation[i][j]);
    }

    printf("\nEnter the Available Resources : \n");
    for(j = 0; j < m; j++)
        scanf("%d", &available[j]);
	
	printf("\n The Need Matrix is as Follows : \n");
	for(i=0;i<n;i++)
	{
	    for(j=0;j<m;j++)
	    {
	        need[i][j]= max[i][j]-allocation[i][j];
	        printf("\t %d",need[i][j]);
	    }
	    printf("\n");
	}
	
	//checking safe state
	for(i=0;i<10;i++)
		finish[i]=0;  //setting finish of all process to 0
	
	
	do{
	  for(k=0;k<n;k++)    //outer loop
	  {
	      for(i=0;i<n;i++)   //loop for process
	      {
	          if(finish[i]==0)    //checking process is finished or not.
	          {
	            count=0;          //setting 1st counter as 0 initially.    
	            for(j=0;j<m;j++)   //loop for resource
	            {
	               if(available[j]>=need[i][j])  //comparing available with need matrix.
	               count++;     //incrementing 1st counter.
	            }
	                             
	            if(count==m)    //if counter equals no of resources
	                            //must be available all resource type.. 
	                            //there should be all or none basis..
	            {               
	               count1++;    //incrementing second counter
	               finish[i]=1;    //setting process as finished
	               sq[count1-1]=i+1;   //putting process in safe sequence array
	               for(j=0;j<m;j++)
	              {
	                   available[j]=available[j]+allocation[i][j];  //incrementing available
	              }
	               break;
	            }
	         }
	     }
	  }
	  
	  if(count1!=n)    //if second counter not equals no. of process, then unsafe state
	  {
	     printf("\nIT'S AN UNSAFE STATE");
	     break;
	  }
	}while(count1!=n);
	

	if(count1==n)    //if second counter not equals no. of process, then safe state
	{
	   printf("\nIT'S A SAFE STATE*");
	   printf("\n The Safe Sequence is:\n");
	   for(i=0;i<n;i++)
	       printf("\t P%d",sq[i]);
	   printf("\n The available array is now : ");
	   for(j=0;j<m;j++)
	       printf("%d",available[j]);
	}
}
