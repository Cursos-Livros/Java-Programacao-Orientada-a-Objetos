package exercicio3.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    private Double calculateTaxValueCompany(Double anualIncomeValueCompany, Integer numberOfEmployeesCompany) {
        if (numberOfEmployeesCompany > 10) {
            return anualIncomeValueCompany * 0.14;
        }
        return anualIncomeValueCompany * 0.16;
    }

    @Override
    public double tax() {
        double taxvalue = 0.0;
        taxvalue = calculateTaxValueCompany(getAnualIncome(), numberOfEmployees);
        return taxvalue;
    }
}
