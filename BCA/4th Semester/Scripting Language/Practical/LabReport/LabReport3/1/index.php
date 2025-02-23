<!-- Write an Object-Oriented PHP Program to implement the concept of inheritance in considering with following class diagram. -->
<?php
class BankAccount{
    private $accountNumber,$totalBalance;
    function deposit($amt,$ac){
        $this->totalBalance+=$amt;
        echo $amt." is Deposited in ".$ac." Account Number.<br/>";
    }
    function withdrew($amt,$ac){
        if($this->totalBalance==0 || $this->totalBalance<$amt)
            echo "Insufficient Balance.<br/>";
        else{
            $this->totalBalance-=$amt;
            echo $amt." is Withdraw from ".$ac." Account Number.<br/>";
        }
    }
    function getBalance(){
        return $this->totalBalance;
    }
}
class SavingAccount extends BankAccount{
    private $interestRate=10;
    function addInterest($ac){
        $interest=0;
        $amt=BankAccount::getBalance();
        $interest=$amt*($this->interestRate/100);
        BankAccount::deposit($interest,$ac);
    }
}
$s=new SavingAccount();
$s->deposit(100000,"BC1258641");
$s->addInterest("BC1258641");
$s->withdrew(50000,"BC1258641");
echo "Total Balance: ".$s->getBalance();
?>