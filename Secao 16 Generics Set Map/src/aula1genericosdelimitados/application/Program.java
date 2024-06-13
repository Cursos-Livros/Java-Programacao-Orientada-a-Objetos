package aula1genericosdelimitados.application;

import aula1genericosdelimitados.entities.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values:");
        int quantity = scanner.nextInt();

        // Generics para Integer
        PrintService<Integer> printService = new PrintService<>();

        for (int i = 0; i < quantity; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        System.out.println(printService.getList().toString());

        System.out.println("First: " + printService.first());
    }
}
