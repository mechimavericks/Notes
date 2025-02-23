class ArrayExample{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        String []str=new String[5];
        str[0]="Santosh";
        str[1]="Anish";
        str[2]="Ayush";
         for(int a: arr)
            System.out.println(a);
         for(String string:str){
            System.out.println(string);
        }
    }
}