package exercise3.application;

import exercise3.entities.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What does it's the dollar price?");
        double dollarPrice = input.nextDouble();
        System.out.println("How many dollars will be bought?");
        double dollarBought = input.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converter(dollarPrice, dollarBought));
    }
}
