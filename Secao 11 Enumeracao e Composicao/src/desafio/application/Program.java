package desafio.application;

import desafio.entities.Address;
import desafio.entities.Department;
import desafio.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do departamento:");
        String departmentName = scanner.nextLine();
        System.out.println("Dia do pagamento:");
        int departmentPayDay = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Email:");
        String departmentEmail = scanner.nextLine();
        System.out.println("Telefone:");
        String departmentTelefone = scanner.nextLine();

        Address address = new Address(departmentEmail, departmentTelefone);
        Department department = new Department(departmentName, departmentPayDay, address);

        System.out.println("Quantos funcionários tem o departamento?");
        int departmentQuantityEmployee = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < departmentQuantityEmployee; i++) {
            System.out.println("Dados do funcionário " + (i + 1) + ":");
            System.out.println("Nome:");
            String employeeName = scanner.nextLine();
            System.out.println("Salario:");
            double employeeSalary = scanner.nextDouble();

            scanner.nextLine();

            Employee employee = new Employee(employeeName, employeeSalary);
            department.addEmployee(employee);
        }

        System.out.println(department);

        scanner.close();
    }
}
