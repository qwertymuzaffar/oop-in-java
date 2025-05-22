package collections;

import java.util.HashSet;

public class EmployeeManager {
    private HashSet<String> employees;

    public EmployeeManager() {
        employees = new HashSet<>();
    }

    public void addEmployee(String employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        System.out.println("Employees in the Company:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("John Doe");
        manager.addEmployee("Jane Smith");
        manager.addEmployee("John Doe"); // Duplicate will not be added
        manager.displayEmployees();
    }
}
