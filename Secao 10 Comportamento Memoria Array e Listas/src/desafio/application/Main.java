package desafio.application;

import desafio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many employees will be registered:");
        int employeeQuantity = input.nextInt();

        List<Employee> employeesList = new ArrayList<>();

        employeesRegistration(employeeQuantity, employeesList);
        employeeSalaryIncrease(employeesList);
        showEmployeeSalary(employeesList);
    }

    public static void employeesRegistration(int employeeQuantity, List<Employee> employeesList) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < employeeQuantity; i++) {
            System.out.println("Enter with " + (i + 1) + " employee:");
            System.out.println("Enter with employee id:");
            int employeeId = Integer.parseInt(input.nextLine());

            System.out.println("Enter with employee name:");
            String employeeName = input.nextLine();

            System.out.println("Enter with employee salary:");
            double employeeSalary = Double.parseDouble(input.nextLine());

            Employee employee = new Employee(employeeId, employeeName, employeeSalary);

            employeesList.add(employee);
        }
    }

    public static void employeeSalaryIncrease(List<Employee> employeesList) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the employee id that will have salary increase:");
        int idEmployee = Integer.parseInt(input.nextLine());
        System.out.println("Enter the percentage:");
        double percentageIncrease = input.nextDouble();

        for (Employee employee : employeesList) {
            if (employee.getId() == idEmployee) {
                employee.increaseSalary(percentageIncrease);
            }
        }

    }

    public static void showEmployeeSalary(List<Employee> employeesList) {
        System.out.println("List of Employees:");

        for (Employee employee : employeesList) {
            System.out.println(employee.toString());
        }
    }
}
