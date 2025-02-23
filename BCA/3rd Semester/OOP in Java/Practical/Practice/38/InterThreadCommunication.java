class Action{
    int x,flag=1;
    synchronized void setValue(int a){
        while(flag!=1)
            try{
                wait();
            }catch(Exception e){};
        x=a;
        flag=0;
        notify();
    }
    synchronized int getValue(){
        int temp;
        while(flag!=0)
        try{
            wait();
        }catch(Exception e){}
        temp =x;
        flag=1;
        notify();
        return temp;
    }
}
class ValueSet extends Thread{
    Action obj;
    ValueSet(Action o){
        obj=o;
    }
    public void run(){
        int i=1;
        while(i<=10){
            obj.setValue(i);
            System.out.println("Set Value = "+i);
            i++;
       }
    }
}
class ValueGet extends Thread{
    Action obj;
    ValueGet(Action o){
        obj=o;
    }
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("Get Value = "+obj.getValue());
            i++;
        } 
    }
}
class InterThreadCommunication{
    public static void main(String args[])throws InterruptedException{
        Action obj=new Action();
        ValueSet t1=new ValueSet(obj);
        ValueGet t2= new ValueGet(obj);
        t1.start();
        t2.start();
    }

}