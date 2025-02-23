// WAP to print first 15 even numbers.
class Even{
    public static void main(String args[]){
        int count=1;
        System.out.println("First 15 Even Numbers:");
        for(int i=1;count<=15;i++)
            if(i%2==0){
                System.out.println(i);
                count++;
            }
    }
}