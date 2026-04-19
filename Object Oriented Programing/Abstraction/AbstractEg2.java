import java.util.Scanner;
/*
* Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
* Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
* */
abstract class BankAccount {
    abstract void deposit(int amt);
    abstract void withdraw(int amt);
    abstract void checkBalance();
}
class SavingAccount extends BankAccount{
    int amount,pin;
    SavingAccount(int pin){
        if(pin==1234)
            this.pin=pin;
        else {
            System.out.println("Wrong PIN");
            return;
        }
        amount=0;
    }
    void deposit(int amt) {
        amount+=amt;
        System.out.println("Amount deposited successfully");
    }
    void withdraw(int amt){
        amount-=amt;
        System.out.println("Amount withdrawn successfully");
    }
    void checkBalance(){
        System.out.println("Savings A/c : "+amount);
    }
}
class CurrentAccount extends BankAccount{
    int amount,pin;
    CurrentAccount(int pin){
        if(pin==2408)
            this.pin=pin;
        else {
            System.out.println("Wrong PIN");
            return;
        }
        amount=0;
    }
    void deposit(int amt) {
        amount+=amt;
        System.out.println("Amount deposited successfully");
    }
    void withdraw(int amt){
        amount-=amt;
        System.out.println("Amount withdrawn successfully");
    }
    void checkBalance(){
        System.out.println("Savings A/c : "+amount);
    }
}
class run{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){;
            System.out.println("1.Savings Account");
            System.out.println("2.Current Account");
            int ch=sc.nextInt();
            switch (ch){
                case 1:System.out.println("Enter your 4 digit pin");
                    int pin=sc.nextInt();
                    SavingAccount ob=new SavingAccount(pin);
                    System.out.println("1.Deposit");
                    System.out.println("2.Withdraw");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Exit");
                    int choice=sc.nextInt();
                    switch (choice){
                        case 1:System.out.println("Enter the amount");
                               int amount=sc.nextInt();
                               ob.deposit(amount);
                               break;
                        case 2:System.out.println("Enter the amount");
                            int amt=sc.nextInt();
                            ob.withdraw(amt);
                            break;
                        case 3:ob.checkBalance();
                               break;
                        case 4:System.exit(0);
                        default:System.out.println("Wrong Input");
                    }
                    break;
                case 2:System.out.println("Enter your 4 digit pin");
                    int code=sc.nextInt();
                    CurrentAccount ob1=new CurrentAccount(code);
                    System.out.println("1.Deposit");
                    System.out.println("2.Withdraw");
                    System.out.println("3.Check Balance");
                    System.out.println("4.Exit");
                    int choices=sc.nextInt();
                    switch (choices){
                        case 1:System.out.println("Enter the amount");
                            int amount=sc.nextInt();
                            ob1.deposit(amount);
                            break;
                        case 2:System.out.println("Enter the amount");
                            int amt=sc.nextInt();
                            ob1.withdraw(amt);
                            break;
                        case 3:ob1.checkBalance();
                            break;
                        case 4:System.exit(0);
                        default:System.out.println("Wrong Input");
                    }
                    break;
                }
                sc.close();
        }
    }
}