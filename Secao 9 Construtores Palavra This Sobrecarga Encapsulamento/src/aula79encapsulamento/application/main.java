package aula79encapsulamento.application;

import aula79encapsulamento.entities.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the product data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        Double price = input.nextDouble();
        System.out.print("Quantity in stock:");
        Integer quantity = input.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("entities.Product data:" + product);

        // Atualiza a quantidade de produtos
        System.out.println("Enter the number of products to be added in stock");
        int newQuantity = input.nextInt();
        product.addProducts(newQuantity);
        System.out.println();
        System.out.println("Updated data:" + product);

        // Remove quantidade de produtos
        System.out.println("Enter the number of products to be removed in stock");
        quantity = input.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data:" + product);


        input.close();
    }
}
