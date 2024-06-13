package aula4palavrafinal.application;

import aula4palavrafinal.entities.Account;
import aula4palavrafinal.entities.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1001, "Olga", 1000.0);
        account1.withdraw(200.0);
        System.out.println(account1.getBalance());

        SavingAccount account2 =  new SavingAccount(1002,"Jose", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        // Chamar implementacao superclasse com super

    }
}