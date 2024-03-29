package aula4palavrafinal.entities;

import aula2upcastingdowncasting.entities.Account;

public class SavingAccount extends Account {
    private Double interestRate;

    public SavingAccount(Double interestRate) {
       super();
    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double ammount) {
        balance -= ammount;
    }
}
