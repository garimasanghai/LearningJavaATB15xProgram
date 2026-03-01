package OOPS_Concepts.Encapsulation;

class Account{

    private String accHolder;
    private double balance;

    public void setAccountHolder (String accHolder){
        this.accHolder = accHolder;
    }

    public String getAccountHolder(){
        return accHolder;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit (double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Amt deposited: " + amount);
            System.out.println("New Balance: " + getBalance());
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public void withdraw (double amount){
        if(amount > 0){
            balance = balance - amount ;
            System.out.println("Amt withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
        else {
            System.out.println("Invalid Input");
        }
    }


}
public class BankApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountHolder("Abc");
        //account.setBalance(500000);
        account.deposit(800000);
        account.withdraw(3000);

    }
}
