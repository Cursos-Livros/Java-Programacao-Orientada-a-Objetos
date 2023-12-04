package exercicios.exercicio11.application;

import exercicios.exercicio11.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static <List> void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees will be registered??");
        int numberQuantity = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Employee> listEmployee = new ArrayList<>();

        fillEmployees(listEmployee, numberQuantity);

        System.out.println("Enter the employee id that will have salary increase :");
        int employeeId = scanner.nextInt();
        if (!verifyIdExist(employeeId, listEmployee)) {
            System.out.println("The number dont exist");
            employeeId = changeId(employeeId, listEmployee);
        }

        System.out.println("Enter the percentage:");
        double percentage = scanner.nextDouble();
        increasePercentage(percentage, employeeId, listEmployee);

        showlistEmployees(listEmployee);
    }

    public static void fillEmployees(ArrayList<Employee> listEmployee, int numberQuantity) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberQuantity; i++) {
            System.out.printf("Employee #%d:%n", i + 1);
            System.out.println("id:");
            int numberId = scanner.nextInt();
            System.out.println("Name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Salary:");
            double salary = scanner.nextDouble();

            if (i == 0) {
                Employee employee = new Employee(numberId, name, salary);
                listEmployee.add(employee);
            } else if (verifyId(numberId, listEmployee)) {
                int newId = changeId(numberId, listEmployee);
                Employee employee = new Employee(newId, name, salary);
                listEmployee.add(employee);
            }
        }
    }

    public static boolean verifyId(int numberId, ArrayList<Employee> listEmployee) {
        boolean verifyer = false;
        for (Employee employeesId : listEmployee) {
            if (employeesId.getId() == numberId) {
                System.out.println("We cannot add this id!");
                return verifyer = true;
            }
        }
        return verifyer;
    }

    public static int changeId(int numberId, ArrayList<Employee> listEmployee) {
        Scanner scanner = new Scanner(System.in);
        int newId = numberId;

        while (newId == numberId) {
            System.out.println("Please add new id!");
            newId = scanner.nextInt();
        }
        return newId;
    }

    public static boolean verifyIdExist(int employeeId, ArrayList<Employee> listEmployee) {
        for (Employee employee : listEmployee) {
            if (employeeId == employee.getId()) {
                return true;
            }
        }
        return false;
    }

    public static void increasePercentage(double percentage, int employeeId, ArrayList<Employee> listEmployee) {
        for (Employee employee : listEmployee) {
            if (employeeId == employee.getId()) {
                employee.increaseSalary(percentage);
            }
        }
    }

    public static void showlistEmployees(ArrayList<Employee> listEmployee) {
        for (Employee employee : listEmployee) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }
    }
}
