#include<stdio.h>
// #include<sys/types.h>
#include<unistd.h>

void main(){
    pid_t pid;
    pid=fork();   //create new child process
    if(pid<0){
        printf("Failed to Create a New Process\n");
    }else if(pid==0){
        printf("Child Process is created!\n");
        printf("Process Id=%d\n",getpid());
    }else{
           printf("Parent Process is created!\n");
           printf("Process Id=%d\n",getpid());
       }
}