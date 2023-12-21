package aula2exerciciocomposicao.application;

import aula2exerciciocomposicao.entities.Department;
import aula2exerciciocomposicao.entities.HourContract;
import aula2exerciciocomposicao.entities.Worker;
import aula2exerciciocomposicao.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter department's name:");
        String departmentName = scanner.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = scanner.nextLine();
        System.out.println("LEVEL: ");
        String workerLevel = scanner.nextLine();
        System.out.println("Base salary:");
        Double baseSalary = scanner.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int numberContracts = scanner.nextInt();

        for (int i = 0; i < numberContracts; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            String dateContract = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateContractParsed = LocalDate.parse(dateContract, formatter);
            System.out.println("Value per hour:");
            double valuePerHour = scanner.nextDouble();
            System.out.println("Duration (hours):");
            int durationHours = scanner.nextInt();
            HourContract contract = new HourContract(dateContractParsed, valuePerHour, durationHours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY):");
        String dateCalculate = scanner.next();
        int month = Integer.parseInt(dateCalculate.substring(0,2));
        int year = Integer.parseInt(dateCalculate.substring(3));
        System.out.println("Name:");
        System.out.println(worker.getName());
        System.out.println("Department:");
        System.out.println(worker.getDepartment().getName());
        System.out.println("Income for: " +  dateCalculate);
        System.out.println(worker.income(year, month));

        scanner.close();
    }
}
