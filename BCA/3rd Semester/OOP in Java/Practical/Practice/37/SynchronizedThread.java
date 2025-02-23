class DisplayData{
    synchronized public void Display(String data){
        for(int i=0;i<data.length();i++)
            System.out.println(data.charAt(i));
    }
}
class Thread1 extends Thread{
    DisplayData d;
    Thread1(DisplayData data){
        d=data;
    }
    public void run(){
        d.Display("Santosh Bhandari ");
    }
}
class Thread2 extends Thread{
    DisplayData d;
    Thread2(DisplayData data){
        d=data;
    }
    public void run(){
        d.Display("Hello");
    }
}
class SynchronizedThread{
    public static void main(String args[]){
        DisplayData d = new DisplayData();
        Thread1 t1=new Thread1(d);
        Thread2 t2=new Thread2(d);
        t1.start();
        t2.start();
    }
}