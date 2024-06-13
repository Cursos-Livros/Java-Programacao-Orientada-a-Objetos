package aula5introducaopolimorfismo.application;

import aula5introducaopolimorfismo.entities.Account;
import aula5introducaopolimorfismo.entities.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Jose", 1000.0);
        Account account2 = new SavingAccount(1, "Olga", 2000.0,1.1);

        account1.withdraw(50.0);
        account2.withdraw(50.0);

        System.out.println("Account 1: " + account1.getBalance());
        System.out.println("Account 2: " +account2.getBalance());
    }
}