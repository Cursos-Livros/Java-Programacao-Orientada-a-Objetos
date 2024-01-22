package Exercicio.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double deposit) {
        this.number = number;
        this.holder = holder;
        this.balance = deposit;
    }

    public void deposit(double depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        this.balance -= withdrawValue - 5.0;
    }

    public String toString() {
        return "Account: " + number + ", " + "Holder: " + holder + "," + "Balance: R" + String.format("%.2f", balance);
    }
}
