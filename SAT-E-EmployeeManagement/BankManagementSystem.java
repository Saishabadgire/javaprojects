

abstract class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited amount");
    }

    abstract void calculateInterest();

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest = " + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }
}

public class BankManagementSystem {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("Saisha", 10000);
        s.deposit(1000);
        s.displayBalance();
        s.calculateInterest();

        System.out.println();

        CurrentAccount c = new CurrentAccount("Rutu", 20000);
        c.deposit(500);
        c.displayBalance();
        c.calculateInterest();
    }
}