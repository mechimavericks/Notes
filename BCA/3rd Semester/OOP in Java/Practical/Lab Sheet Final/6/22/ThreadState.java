class ThreadState extends Thread{
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String args[]){
        ThreadState t1 = new ThreadState();
        ThreadState t2 = new ThreadState();
        System.out.println("t1 State: "+t1.getState());
        System.out.println("t2 State: "+t2.getState());
        t1.start();
        System.out.println("t1 State: "+t1.getState());
        t2.start();
        System.out.println("t2 State: "+t2.getState());
    }
}