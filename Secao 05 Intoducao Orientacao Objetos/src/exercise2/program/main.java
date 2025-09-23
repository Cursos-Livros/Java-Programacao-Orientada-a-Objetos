package exercise2.program;

import exercise2.entities.Employee;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter with your name:");
        employee.name = input.nextLine();
        System.out.println("Enter with you gross salary:");
        employee.grossSalary = input.nextDouble();
        System.out.println("Enter with the tax:");
        employee.tax = input.nextDouble();

        System.out.println("Name: " + employee.name);
        System.out.printf("Net salary: %.2f %n",employee.netSalary());

        System.out.println("Wich percentage to increase salary?");
        int percentageToIncrease = input.nextInt();

        System.out.println("Updated Data:");
        System.out.println("Name: " + employee.name);
        System.out.printf("Net salary: %.2f %n",employee.increaseSalary(percentageToIncrease));
    }
}
