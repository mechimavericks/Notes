using System;
class Application{
    private int amount=0;
    public Application(int amount){
        this.amount = amount;
    }
    public void readBalance(){
        Console.WriteLine("Your Balance is {0}.",this.amount);
    }
    public void withDraw(int amount){
        try{
            if (amount <=0){
                throw new Exception("Invalid Amount");
            }else if (amount>this.amount){
                throw new Exception("Fund Insufficient.");
            }else{
                this.amount-=amount;
                Console.WriteLine("Withdrawl Balance : {0}",amount);
                Console.WriteLine("Remaining Balance : {0}",this.amount);
            }
        }catch(Exception Ex){
            Console.WriteLine(Ex.Message);
        }
    }
}
class MainProgram{
    public static void Main(){
        Application obj = new Application(100000);
        obj.readBalance();
        obj.withDraw(50000);
        obj.withDraw(1000);
        obj.readBalance();
        obj.withDraw(100000);
        obj.withDraw(-2000);
        obj.withDraw(2000);
    }
}