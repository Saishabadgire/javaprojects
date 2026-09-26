package com.sate.Exception;

public class Customer {
    
    public static void main(String[] args) {
        
        BankAccount bankAccount = new BankAccount();
        
        try {
            bankAccount.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed : " + e.getMessage());
        }
    }    
}
