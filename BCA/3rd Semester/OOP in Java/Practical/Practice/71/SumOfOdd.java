class SumOfOdd{
    public static void main(String args[]){
        int sum=0;
        int arr[]={1,5,3,6,4,8,6,2,45,50,5,8,69,9,5,10,4,56,4,6,85,98,5};
        for(int digit:arr){
            if(digit%2==1){
                // System.out.println(digit);
                sum+=digit;
            }
        }
        System.out.println("Sum = "+sum);
   }
}