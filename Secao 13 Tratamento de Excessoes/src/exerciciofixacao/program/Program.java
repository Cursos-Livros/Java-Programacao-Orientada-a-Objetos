package exerciciofixacao.program;

import exerciciofixacao.model.entities.Account;
import exerciciofixacao.model.exception.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.println("Number:");
            int numberAccount = scanner.nextInt();
            System.out.println("Holder:");
            scanner.nextLine();
            String numberHolder = scanner.nextLine();
            System.out.println("Initial balance:");
            double initialBalance = scanner.nextDouble();
            System.out.println("Withdraw limit:");
            double withDrawLimit = scanner.nextDouble();

            Account account = new Account(numberAccount, numberHolder, initialBalance, withDrawLimit);

            System.out.println("Enter amount for withdraw:");
            double amount = scanner.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance:");
            System.out.println(account.getBalance());
        } catch (InputMismatchException e) {
            System.out.println("This input type its not for this field");
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }
    }
}
