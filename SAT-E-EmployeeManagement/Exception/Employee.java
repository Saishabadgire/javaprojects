package com.sate.Exception;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    // This method throws the exception if salary is below 0
    public void setSalary(double salary) throws NegativeSalaryException {
        if (salary < 0) {
            throw new NegativeSalaryException(" Salary cannot be negative ($" + salary + ")");
        }
        this.salary = salary;
        System.out.println(name + "'s salary successfully set to: $" + this.salary);
    }
}