class GarbageExample{
    public void finalize(){
        System.out.println("Garbage Collected.");
    }
    public static void main(String args[]){
        GarbageExample obj1=new GarbageExample();
        GarbageExample obj2=new GarbageExample();
        GarbageExample obj3=new GarbageExample();
        GarbageExample obj4=new GarbageExample();
        obj1=obj2=obj3=obj4=null;
        System.gc();
    }
}