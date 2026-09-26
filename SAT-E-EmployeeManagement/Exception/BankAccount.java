package com.sate.Exception;

public class BankAccount {

    double balance = 5000;
    
    // common method
    public void withdraw(double amount) throws InsufficientBalanceException
    {
        //if amount > balance
        if(amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful");
    }    
    
}
