package com.sate.Exception;

public class MainTest {
    public static void main(String[] args) {
        
        // 1. TEST SALARY EXCEPTION
        Employee emp = new Employee("saisha");
        
        try {
            emp.setSalary(-500); // This is negative, so it will go to catch block
        } catch (NegativeSalaryException e) {
            System.out.println("Caught Error: " + e.getMessage());
        }


        // 2. TEST AGE EXCEPTION
        Voter voterObj = new Voter();
        
        try {
            voterObj.checkEligibility(15); // Under 18, so it will go to catch block
        } catch (InvalidAgeException e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
        
    }
}
