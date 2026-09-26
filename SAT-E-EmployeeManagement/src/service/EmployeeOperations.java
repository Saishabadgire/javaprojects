package service;

import model.Employee;

public interface EmployeeOperations {

    void addEmployee(Employee employee);

    void viewAllEmployees();

    Employee searchEmployeeById(int employeeId);

    void searchEmployeeByName(String name);

    void updateEmployee(int employeeId);

    void deleteEmployee(int employeeId);

    void viewEmployeeDetails(int employeeId);
}
