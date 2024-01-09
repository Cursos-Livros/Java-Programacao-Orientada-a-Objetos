package exercicio3.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    private double individualIncomeLess15(Double anualIncomeValue, Double healthExpenditures) {
        return (anualIncomeValue * 0.15) + (healthExpenditures * 0.5);
    }

    private double individualIncomeLess25(Double anualIncomeValue, double healthExpenditures) {
        return (anualIncomeValue * 0.25) - (healthExpenditures * 0.5);
    }

    @Override
    public double tax() {
        double taxValue = 0.0;
        if (getAnualIncome() < 15.000) {
            taxValue = individualIncomeLess15(getAnualIncome(), healthExpenditures);
        } else if (getAnualIncome() >= 25.000) {
            taxValue = individualIncomeLess25(getAnualIncome(), healthExpenditures);
        }
        return taxValue;
    }
}
