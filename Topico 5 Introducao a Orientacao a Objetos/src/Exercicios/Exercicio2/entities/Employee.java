package Exercicios.Exercicio2.entities;

public class Employee {
    public String name = "Username";
    public double grossSalary = 0.0;
    public double tax = 0.0;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100.0);
    }

    public String toString() {
        return "Employee: " + name + " $ " + String.format("%.2f", netSalary());
    }
}
