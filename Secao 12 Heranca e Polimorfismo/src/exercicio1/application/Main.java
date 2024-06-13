package exercicio1.application;

import exercicio1.entities.Employee;
import exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int numberEmployees = scanner.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        // Preenche a lista de funcionarios
        for (int i = 0; i < numberEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " :");
            System.out.println("Outsourced (y/n):");
            char outsourcedOption = scanner.next().charAt(0);
            System.out.println("Name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Hours:");
            int hours = scanner.nextInt();
            System.out.println("Value per Hour:");
            double valuePerHour = scanner.nextDouble();

            if (outsourcedOption == 'y') {
                System.out.println("Additional charge:");
                double additionalCharge = scanner.nextDouble();
                Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                listEmployee.add(outsourcedEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                listEmployee.add(employee);
            }
        }

        System.out.println();

        System.out.println("Payments");
        for (Employee employee : listEmployee) {
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }
    }
}
