package aula6classeabstrata.application;

import aula6classeabstrata.entities.Account;
import aula6classeabstrata.entities.BusinessAccount;
import aula6classeabstrata.entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;

// Classes Abstratas
// As Superclasses que não podem ser instanciadas somente as subclasses
// Herança total
// Palavra chave abstract
public class Main {
    public static void main(String[] args) {

        // Não irá funcionar pois é uma superclasse abstrata
        // Account account1 = new Account(1001, "Jose", 1000.0);
        Account account2 = new SavingAccount(1002, "Olga", 1000.0, 0.01);
        Account account3 = new BusinessAccount(1003, "Abby", 1000.0, 500.0);

        // Lista do tipo mais generico possivel (polimorfismo)
        List<Account> listAccount = new ArrayList<>();

        // Preenchendo lista com as contas
        listAccount.add(new SavingAccount(1004, "Alloy", 1000.0, 0.02));
        listAccount.add(new BusinessAccount(1006, "teste", 1000.0, 500.0));
        listAccount.add(new BusinessAccount(1007, "teste2", 1000.0, 400.0));
        listAccount.add(new SavingAccount(1008, "teste3", 1000.0, 0.02));

        double sum = 0.0;

        for (Account account : listAccount) {
            sum += account.getBalance();
        }

        System.out.println("Total balance: " + String.format("%.2f", sum));

        for(Account account: listAccount){
            account.deposit(10.0);
        }

        for(Account account: listAccount){
            System.out.println("Account :" + account.getNumber() + " balance:" + account.getBalance());
        }
    }
}