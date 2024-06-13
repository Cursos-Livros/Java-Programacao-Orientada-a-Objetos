package Desafio.entities;

public class TaxPayer {
    private double salaryIncome;
    private double serviceIncome;
    private double capitalIncome;
    private double healthSpending;
    private double educationSpending;


    public TaxPayer(double salaryAnnualIncome, double serviceIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryAnnualIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    private double monthSalary(){
        return salaryIncome/12;
    }

    public double salaryTax() {
        if (monthSalary() < 3000) {
            return 0.0;
        }
        if (monthSalary() >= 3000 && monthSalary() < 5000) {
            return salaryIncome * 0.1;
        }
        return salaryIncome * 0.2;
    }

    public double serviceTax() {
        return serviceIncome * 0.15;
    }

    public double capitalTax() {
        return capitalIncome * 0.20;
    }

    public double grossTax() {
        return salaryTax() + serviceTax() + capitalTax();
    }

    public double taxRebate() {
        double maximumRebate = grossTax() * 0.3;
        if (healthSpending + educationSpending < maximumRebate) {
            return healthSpending + educationSpending;
        }
        return maximumRebate;
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }
}
