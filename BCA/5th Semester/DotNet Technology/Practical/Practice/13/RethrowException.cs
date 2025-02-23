using System;
class RethrowException{
    static void Main(){
        int cp,sp,profit;
        Console.WriteLine("Enter CP and SP: ");
        cp = Convert.ToInt32(Console.ReadLine());
        sp = int.Parse(Console.ReadLine());
        try{
            if(sp>cp){
                Console.WriteLine("Profit : {0}",(sp-cp));
            }else{
                throw new ArithmeticException("Cannot Calculate Profit");
            }
        }catch(ArithmeticException ex){
            Console.WriteLine(ex);
            throw;
        }
    }
}