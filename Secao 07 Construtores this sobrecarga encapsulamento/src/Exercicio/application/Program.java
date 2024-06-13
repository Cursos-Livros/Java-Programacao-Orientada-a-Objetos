package Exercicio.application;

import Exercicio.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Account account; // Para instanciar um objeto

        System.out.println("Enter the account number:");
        int inputNumber = scanner.nextInt();
        System.out.println("Enter the account holder:");
        String inputHolder = scanner.next();
        scanner.nextLine();

        System.out.println("Is there initial deposit:");
        char response = scanner.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter the initial deposit:");
            double initialDeposit = scanner.nextDouble();
            account = new Account(inputNumber, inputHolder, initialDeposit);
        } else {
            account = new Account(inputNumber, inputHolder);
        }

        System.out.println("Account Data:");
        System.out.println(account);

        System.out.println("Enter deposit value:");
        double deposit = scanner.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account Data:");
        System.out.println(account);

        System.out.println("Enter withdraw value:");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account Data:");
        System.out.println(account);


        scanner.close();
    }
}
