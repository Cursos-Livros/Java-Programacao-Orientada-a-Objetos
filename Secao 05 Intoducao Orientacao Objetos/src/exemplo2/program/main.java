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

        System.out.println(product.name + "," + product.price + "," + product.quantity);

        input.close();
    }
}
