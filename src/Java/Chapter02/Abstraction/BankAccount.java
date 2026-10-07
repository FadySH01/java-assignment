package Java.Chapter02.Abstraction;

abstract class BankAccount {
    String accountNumber;

    BankAccount(String accNum){
        this.accountNumber = accNum;
    }

    abstract void calculateInterest();

    void displayAccount(){
        System.out.println("Account Number:" + accountNumber);
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(String accNum){
        super(accNum);
    }

    void calculateInterest(){
        System.out.println("Saving Account Interest = 4%");
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(String accNum){
        super(accNum);
    }

     void calculateInterest(){
         System.out.println("Current Account: no interest");
     }
}

class BankTest{
    public static void main(String[] args) {
        BankAccount acc1 = new SavingAccount("S123");
        acc1.displayAccount();
        acc1.calculateInterest();

        BankAccount acc2 = new CurrentAccount("C456");
        acc2.displayAccount();
        acc2.calculateInterest();
    }
}