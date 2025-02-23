class ThreadPriority extends Thread{
    public void run(){
        System.out.println(Thread.currentThread()+" Thread is Running and Priority is "+Thread.currentThread().getPriority());
    }
    public static void main(String args[]){
        ThreadPriority t1 =  new ThreadPriority();
        ThreadPriority t2 =  new ThreadPriority();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t1.start();
    }
}