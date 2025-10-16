package aula89_vetoresparte2.application;

import aula89_vetoresparte2.entities.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the product quantity:");
        int productQuantity = input.nextInt();

        Product[] productList = new Product[productQuantity];

        productFill(productList);
        double averagePrice = calculateAveragePrice(productList);

        System.out.println("Average price:" + averagePrice);

        input.close();
    }

    public static void productFill(Product[] productList) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < productList.length; i++) {
            System.out.println("Enter the product data:");
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Price: ");
            double price = Double.parseDouble(input.nextLine()); // Melhor para lhe dar com o problema do /n no buffer de memória

            productList[i] = new Product(name, price);
        }

        input.close();
    }

    public static double calculateAveragePrice(Product[] productList) {
        double averagePrice = 0;

        for (int i = 0; i < productList.length; i++) {
            averagePrice += productList[i].price;
        }

        return averagePrice / productList.length;
    }
}
