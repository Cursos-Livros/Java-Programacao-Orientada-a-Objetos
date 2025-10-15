package exercicio1.application;

import exercicio1.entities.Account;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.println("Enter the account number:");
        int accountNumber = input.nextInt();
        input.nextLine();
        System.out.println("Enter with account holder:");
        String accountHolder = input.nextLine();
        System.out.println("Is there a initial deposit? y/n");
        Character initialDepositOption = input.next().charAt(0);

        while (!verifyInitialDepositOption(initialDepositOption)) {
            showInitialDepositOptionError(initialDepositOption);
            initialDepositOption = input.next().charAt(0);
        }

        if (Character.toLowerCase(initialDepositOption) == 'n') {
            account = new Account(accountNumber, accountHolder);
        } else {
            System.out.println("Enter the initial value: ");
            double initialValue = input.nextDouble();
            account = new Account(accountNumber, accountHolder, initialValue);
        }

        System.out.println("Account Data:");
        System.out.println(account.toString());
        System.out.println("Enter with a deposit value:");
        double depositValue = input.nextDouble();

        account.deposit(depositValue);
        System.out.println("Updated Data:");
        System.out.println(account.toString());

        System.out.println("Enter with a withdraw value:");
        double withdrawValue = input.nextDouble();

        account.withdraw(withdrawValue);
        System.out.println("Updated Data:");
        System.out.println(account.toString());

        input.close();
    }
    public static boolean verifyInitialDepositOption(Character initialDepositOption) {
        if (initialDepositOption == null) {
            return false;
        }

        return Character.toLowerCase(initialDepositOption) == 'y' || Character.toLowerCase(initialDepositOption) == 'n';
    }

    public static void showInitialDepositOptionError(Character initialDepositOption) {
        System.out.println("The option " + initialDepositOption + " it's not allowed");
        System.out.println("Is there a initial deposit? y/n");
    }
}
