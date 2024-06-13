package _Aula1ComecandoResolverSegundoExemplo.application;

import _Aula1ComecandoResolverSegundoExemplo.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Instancia o objeto
        Product product = new Product();

        System.out.println("Enter the product Data:");
        System.out.println("Name: ");
        product.name = scanner.nextLine();
        System.out.println("Price: ");
        product.price = scanner.nextDouble();
        System.out.println("Quantitiy in stock:");
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println("Product Data :" + product);

        System.out.println("Enter the number of products to be added  in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data :" + product);

        System.out.println("Enter the number of products to be removed  in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated Data :" + product);
    }
}
