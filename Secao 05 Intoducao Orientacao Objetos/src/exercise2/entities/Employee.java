package exercise2.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public Double increaseSalary(int percentage) {
        double percentageCalculated = (double) percentage / 100;
        return netSalary() + (grossSalary * percentageCalculated);
    }
}
