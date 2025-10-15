package exercicio1.entities;

public class Account {
    private Integer account;
    private String name;
    private Double balance;
    private Double withdrawTax = 5.00;

    public Account(Integer account, String name) {
        this.account = account;
        this.name = name;
    }

    public Account(Integer account, String name, Double balance) {
        this.account = account;
        this.name = name;
        this.balance = balance;
    }

    public Integer getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double value) {
        this.balance += value;
    }

    public void withdraw(Double value) {
        this.balance -= value + withdrawTax;
    }

    @Override
    public String toString() {
        return  "account: " + account +
                ", holder: '" + name + '\'' +
                ", balance: " + balance;
    }
}
