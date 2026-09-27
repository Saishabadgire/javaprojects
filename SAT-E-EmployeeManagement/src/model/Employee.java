package model;

public class Employee extends Person {

    private int employeeId;
    private String department;
    private String designation;
    private double salary;
    private EmploymentStatus status;

    public static final double MINIMUM_SALARY = 10000;

    public Employee(
            int employeeId,
            String name,
            String email,
            String phoneNumber,
            String department,
            String designation,
            double salary,
            EmploymentStatus status) {

        super(name, email, phoneNumber);

        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public EmploymentStatus getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(EmploymentStatus status) {
        this.status = status;
    }

    @Override
    public void displayDetails() {

        System.out.println("----------------------------------");
        System.out.println("Employee ID     : " + employeeId);
        System.out.println("Employee Name   : " + name);
        System.out.println("Email           : " + email);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Department      : " + department);
        System.out.println("Designation     : " + designation);
        System.out.println("Salary          : " + salary);
        System.out.println("Status          : " + status);
        System.out.println("----------------------------------");
    }
}
