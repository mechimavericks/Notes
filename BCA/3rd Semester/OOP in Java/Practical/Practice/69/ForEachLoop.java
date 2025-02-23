class ForEachLoop{
    public static void main(String args[]){
        int a[]=new int[10];
        int i=0;
        do{
            a[i]=i+1;
            i++;
        }while(i<10);
        for(int data:a){
            System.out.println(data);
        }
    }
}