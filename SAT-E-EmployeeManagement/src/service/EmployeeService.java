package service;

import java.util.Scanner;

import model.Employee;
import model.EmploymentStatus;
import exception.InvalidEmployeeException;
import exception.EmployeeNotFoundException;

public class EmployeeService implements EmployeeOperations {

    // Array for storing employees
    private Employee[] employees;

    private int employeeCount;

    private Scanner scanner;

    // Constructor
    public EmployeeService(int size) {

        employees = new Employee[size];

        employeeCount = 0;

        scanner = new Scanner(System.in);
    }

    // Add Employee
    @Override
    public void addEmployee(Employee employee) {

        try {

            if (employeeCount >= employees.length) {
                throw new InvalidEmployeeException(
                        "Employee storage is full.");
            }

            if (employee == null) {
                throw new InvalidEmployeeException(
                        "Employee information cannot be empty.");
            }

            if (employee.getEmployeeId() <= 0) {
                throw new InvalidEmployeeException(
                        "Employee ID must be greater than 0.");
            }

            if (findEmployeeIndex(employee.getEmployeeId()) != -1) {
                throw new InvalidEmployeeException(
                        "Employee ID already exists.");
            }

            if (employee.getName() == null ||
                    employee.getName().trim().isEmpty()) {

                throw new InvalidEmployeeException(
                        "Employee name is required.");
            }

            if (employee.getEmail() == null ||
                    employee.getEmail().isEmpty()) {

                throw new InvalidEmployeeException(
                        "Email is required.");
            }

            if (employee.getPhoneNumber() == null ||
                    employee.getPhoneNumber().trim().isEmpty()) {

                throw new InvalidEmployeeException(
                        "Phone number is required.");
            }

            if (employee.getDepartment() == null ||
                    employee.getDepartment().trim().isEmpty()) {

                throw new InvalidEmployeeException(
                        "Department is required.");
            }

            if (employee.getDesignation() == null ||
                    employee.getDesignation().trim().isEmpty()) {

                throw new InvalidEmployeeException(
                        "Designation is required.");
            }

            if (employee.getSalary() < Employee.MINIMUM_SALARY) {

                throw new InvalidEmployeeException(
                        "Salary must be at least "
                                + Employee.MINIMUM_SALARY);
            }

            employees[employeeCount] = employee;

            employeeCount++;

            System.out.println(
                    "Employee added successfully.");

        } catch (InvalidEmployeeException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    // View All Employees
    @Override
    public void viewAllEmployees() {

        if (employeeCount == 0) {

            System.out.println("No employees available.");

            return;
        }

        System.out.println("\n========== ALL EMPLOYEES ==========");

        for (int i = 0; i < employeeCount; i++) {

            System.out.println(
                    "ID: " + employees[i].getEmployeeId()
                    + " | Name: " + employees[i].getName()
                    + " | Department: "
                    + employees[i].getDepartment()
                    + " | Designation: "
                    + employees[i].getDesignation()
                    + " | Salary: "
                    + employees[i].getSalary()
                    + " | Status: "
                    + employees[i].getStatus());
        }
    }

    // Search Employee by ID
    @Override
    public Employee searchEmployeeById(int employeeId) {

        try {

            int index = findEmployeeIndex(employeeId);

            if (index == -1) {

                throw new EmployeeNotFoundException(
                        "Employee with ID "
                                + employeeId
                                + " does not exist.");
            }

            return employees[index];

        } catch (EmployeeNotFoundException e) {

            System.out.println("Error: " + e.getMessage());

            return null;
        }
    }

    // Search Employee by Name
    @Override
    public void searchEmployeeByName(String name) {

        boolean found = false;

        if (name == null || name.trim().isEmpty()) {

            System.out.println("Name cannot be empty.");

            return;
        }

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {

                employees[i].displayDetails();

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "No employee found with name: " + name);
        }
    }

    // Update Employee
    @Override
    public void updateEmployee(int employeeId) {

        Employee employee = searchEmployeeById(employeeId);

        if (employee == null) {
            return;
        }

        boolean running = true;

        while (running) {

            System.out.println("\n========== UPDATE EMPLOYEE ==========");
            System.out.println("1. Update Name");
            System.out.println("2. Update Email");
            System.out.println("3. Update Phone");
            System.out.println("4. Update Department");
            System.out.println("5. Update Designation");
            System.out.println("6. Update Salary");
            System.out.println("7. Update Status");
            System.out.println("8. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {

                case 1:

                    String name = readRequiredString(
                            "Enter new name: ");

                    employee.setName(name);

                    System.out.println(
                            "Name updated successfully.");

                    break;

                case 2:

                    String email = readRequiredString(
                            "Enter new email: ");

                    employee.setEmail(email);

                    System.out.println(
                            "Email updated successfully.");

                    break;

                case 3:

                    String phone = readRequiredString(
                            "Enter new phone number: ");

                    employee.setPhoneNumber(phone);

                    System.out.println(
                            "Phone updated successfully.");

                    break;

                case 4:

                    String department = readRequiredString(
                            "Enter new department: ");

                    employee.setDepartment(department);

                    System.out.println(
                            "Department updated successfully.");

                    break;

                case 5:

                    String designation = readRequiredString(
                            "Enter new designation: ");

                    employee.setDesignation(designation);

                    System.out.println(
                            "Designation updated successfully.");

                    break;

                case 6:

                    double salary = readDouble(
                            "Enter new salary: ");

                    if (salary < Employee.MINIMUM_SALARY) {

                        System.out.println(
                                "Salary must be at least "
                                + Employee.MINIMUM_SALARY);

                    } else {

                        employee.setSalary(salary);

                        System.out.println(
                                "Salary updated successfully.");
                    }

                    break;

                case 7:

                    EmploymentStatus status =
                            readStatus();

                    employee.setStatus(status);

                    System.out.println(
                            "Status updated successfully.");

                    break;

                case 8:

                    running = false;

                    break;

                default:

                    System.out.println(
                            "Invalid choice.");
            }
        }
    }

    // Delete Employee
    @Override
    public void deleteEmployee(int employeeId) {

        int index = findEmployeeIndex(employeeId);

        if (index == -1) {

            System.out.println(
                    "Employee does not exist.");

            return;
        }

        // Shift employees to the left
        for (int i = index; i < employeeCount - 1; i++) {

            employees[i] = employees[i + 1];
        }

        employees[employeeCount - 1] = null;

        employeeCount--;

        System.out.println(
                "Employee deleted successfully.");
    }

    // View Employee Details
    @Override
    public void viewEmployeeDetails(int employeeId) {

        Employee employee = searchEmployeeById(employeeId);

        if (employee != null) {

            employee.displayDetails();
        }
    }

    // Find employee index
    private int findEmployeeIndex(int employeeId) {

        for (int i = 0; i < employeeCount; i++) {

            if (employees[i].getEmployeeId() == employeeId) {

                return i;
            }
        }

        return -1;
    }

    // Read integer safely
    public int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid number.");
            }
        }
    }

    // Read double safely
    public double readDouble(String message) {

        while (true) {

            try {

                System.out.print(message);

                return Double.parseDouble(
                        scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid salary.");
            }
        }
    }

    // Required String
    public String readRequiredString(String message) {

        while (true) {

            System.out.print(message);

            String value = scanner.nextLine().trim();

            if (!value.isEmpty()) {

                return value;
            }

            System.out.println(
                    "This field cannot be empty.");
        }
    }

    // Read Employment Status
    public EmploymentStatus readStatus() {

        while (true) {

            System.out.println(
                    "1. ACTIVE");

            System.out.println(
                    "2. INACTIVE");

            System.out.println(
                    "3. ON_LEAVE");

            int choice = readInt(
                    "Select status: ");

            switch (choice) {

                case 1:
                    return EmploymentStatus.ACTIVE;

                case 2:
                    return EmploymentStatus.INACTIVE;

                case 3:
                    return EmploymentStatus.ON_LEAVE;

                default:

                    System.out.println(
                            "Invalid status.");
            }
        }
    }

    public String getInput(String message) {

        System.out.print(message);

        return scanner.nextLine().trim();
    }
}