package aula6classeabstrata.entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }


    public void loan(Double ammount) {
        if (ammount <= loanLimit) {
            balance += ammount - 10;
        }
    }

    // Super utilizado para chamar atribusto da superclass
    @Override
    public void withdraw(Double ammount) {
        super.withdraw(ammount);
        balance -= ammount + 2.0;
    }
}
