package Exercicios.Exercicio2.application;

import Exercicios.Exercicio2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the name:");
        employee.name = scanner.nextLine();
        System.out.println("Enter the gross salary:");
        employee.grossSalary = scanner.nextDouble();
        System.out.println("Enter the tax:");
        employee.tax = scanner.nextDouble();

        System.out.println(employee);

        System.out.println("Wich percentage to increse");
        double inputIncreasePercentage = scanner.nextDouble();
        employee.increaseSalary(inputIncreasePercentage);

        System.out.println("Updated data: " + employee);
    }
}
