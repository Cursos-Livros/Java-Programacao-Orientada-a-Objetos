package exemplo2.program;

import exemplo2.entities.Product;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter the product data:");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: ");
        product.price = input.nextDouble();
        System.out.print("Quantity in stock:");
        product.quantity = input.nextInt();

        System.out.println("Product data:" + product);

        // Atualiza a quantidade de produtos
        System.out.println("Enter the number of products to be added in stock");
        int quantity = input.nextInt();
        product.addProducts(quantity);
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
