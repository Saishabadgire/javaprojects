package main;

import java.util.Scanner;

import model.Employee;
import model.EmploymentStatus;
import service.EmployeeService;

public class EmployeeManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeService service =
                new EmployeeService(100);

        boolean running = true;

        while (running) {

            displayMenu();

            int choice;

            try {

                System.out.print("Enter choice: ");

                choice = Integer.parseInt(
                        scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number.");

                continue;
            }

            switch (choice) {

                case 1:

                    addEmployee(scanner, service);

                    break;

                case 2:

                    service.viewAllEmployees();

                    break;

                case 3:

                    searchEmployee(scanner, service);

                    break;

                case 4:

                    int updateId =
                            readInteger(scanner,
                                    "Enter Employee ID: ");

                    service.updateEmployee(updateId);

                    break;

                case 5:

                    int deleteId =
                            readInteger(scanner,
                                    "Enter Employee ID: ");

                    service.deleteEmployee(deleteId);

                    break;

                case 6:

                    int viewId =
                            readInteger(scanner,
                                    "Enter Employee ID: ");

                    service.viewEmployeeDetails(viewId);

                    break;

                case 7:

                    running = false;

                    System.out.println(
                            "Thank you for using SAT-E Employee Management.");

                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please select 1-7.");
            }
        }

        scanner.close();
    }

    // Display menu
    public static void displayMenu() {

        System.out.println();
        System.out.println(
                "====================================");

        System.out.println(
                "       SAT-E EMPLOYEE MANAGEMENT");

        System.out.println(
                "====================================");

        System.out.println(
                "1. Add Employee");

        System.out.println(
                "2. View All Employees");

        System.out.println(
                "3. Search Employee");

        System.out.println(
                "4. Update Employee");

        System.out.println(
                "5. Delete Employee");

        System.out.println(
                "6. View Employee Details");

        System.out.println(
                "7. Exit");

        System.out.println(
                "====================================");
    }

    // Add employee
    public static void addEmployee(
            Scanner scanner,
            EmployeeService service) {

        System.out.println(
                "\n========== ADD EMPLOYEE ==========");

        int id = readInteger(
                scanner,
                "Enter Employee ID: ");

        String name = readRequiredString(
                scanner,
                "Enter Employee Name: ");

        String email = readRequiredString(
                scanner,
                "Enter Email: ");

        String phone = readRequiredString(
                scanner,
                "Enter Phone Number: ");

        String department = readRequiredString(
                scanner,
                "Enter Department: ");

        String designation = readRequiredString(
                scanner,
                "Enter Designation: ");

        double salary = readDouble(
                scanner,
                "Enter Salary: ");

        EmploymentStatus status =
                readStatus(scanner);

        Employee employee = new Employee(
                id,
                name,
                email,
                phone,
                department,
                designation,
                salary,
                status);

        service.addEmployee(employee);
    }

    // Search menu
    public static void searchEmployee(
            Scanner scanner,
            EmployeeService service) {

        System.out.println(
                "\n========== SEARCH EMPLOYEE ==========");

        System.out.println(
                "1. Search by ID");

        System.out.println(
                "2. Search by Name");

        int choice = readInteger(
                scanner,
                "Enter choice: ");

        switch (choice) {

            case 1:

                int id = readInteger(
                        scanner,
                        "Enter Employee ID: ");

                Employee employee =
                        service.searchEmployeeById(id);

                if (employee != null) {

                    employee.displayDetails();
                }

                break;

            case 2:

                String name = readRequiredString(
                        scanner,
                        "Enter Employee Name: ");

                service.searchEmployeeByName(name);

                break;

            default:

                System.out.println(
                        "Invalid choice.");
        }
    }

    // Safe integer input
    public static int readInteger(
            Scanner scanner,
            String message) {

        while (true) {

            try {

                System.out.print(message);

                return Integer.parseInt(
                        scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid integer.");
            }
        }
    }

    // Safe double input
    public static double readDouble(
            Scanner scanner,
            String message) {

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

    // Required String input
    public static String readRequiredString(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String value =
                    scanner.nextLine().trim();

            if (!value.isEmpty()) {

                return value;
            }

            System.out.println(
                    "This field cannot be empty.");
        }
    }

    // Status input
    public static EmploymentStatus readStatus(
            Scanner scanner) {

        while (true) {

            System.out.println(
                    "1. ACTIVE");

            System.out.println(
                    "2. INACTIVE");

            System.out.println(
                    "3. ON_LEAVE");

            int choice = readInteger(
                    scanner,
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
}