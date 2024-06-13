package aula5vetoresparte2.application;

import aula5vetoresparte2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Product[] arrayProduct = new Product[number];

        // Array que guarda objetos
        for (int i = 0; i < arrayProduct.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            arrayProduct[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < arrayProduct.length; i++) {
            sum += arrayProduct[i].getPrice(); // Pega o getprice de cada produto
        }

        double average = sum / number;

        System.out.printf("Average price = %.2f%n", average);
        scanner.close();
    }
}
