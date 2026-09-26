package com.sate.Exception;

public class Voter {
    
    // Throws exception if age is less than the voting legal limit (18) or unrealistic
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException(" Age entered is physically impossible (" + age + ")");
        }
        if (age < 18) {
            throw new InvalidAgeException(" Age " + age + " is too young to register to vote.");
        }
        System.out.println("Registration Successful! Eligible to vote.");
    }
}
