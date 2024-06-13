package Exercicios.Parte2.exercicio1.program;

import Exercicios.Parte2.exercicio1.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the dolar value:");
        double dolarPrice = scanner.nextDouble();

        System.out.println("How many dollars will be buy: ");
        double dolarValueQuantity = scanner.nextDouble();

        System.out.printf("Value will be paied on Reais: %.2f", CurrencyConverter.convertCurrency(dolarValueQuantity, dolarPrice));

        scanner.close();
    }
}
