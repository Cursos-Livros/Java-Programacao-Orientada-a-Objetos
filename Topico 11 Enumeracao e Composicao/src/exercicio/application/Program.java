package exercicio.application;

import aula1enumeracao.enums.OrderStatus;
import exercicio.entities.Client;
import exercicio.entities.Order;
import exercicio.entities.OrderItem;
import exercicio.entities.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Birth Date (yyyy-MM-dd'T'HH:mm:ss):");
        String date = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        LocalDateTime dateParsed = LocalDateTime.parse(date, formatter);

        Client client = new Client(name, email, dateParsed);

        System.out.println("Enter order data:");
        System.out.println("Status:");
        OrderStatus status = OrderStatus.valueOf(scanner.next()); // Use scanner.next() para ler uma única palavra
        System.out.println("How many items to this order:");
        int itemsQuantity = scanner.nextInt();

        LocalDateTime now = LocalDateTime.now();

        Order order = new Order(client, now, status);
        order.setStatus(status);

        for (int i = 0; i < itemsQuantity; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.println("Product Name:");
            scanner.nextLine(); // Limpar o buffer antes de ler a próxima linha
            String productName = scanner.nextLine();
            System.out.println("Product Price:");
            double productPrice = scanner.nextDouble();
            System.out.println("Quantity:");
            int productQuantity = scanner.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println(order);

        scanner.close();
    }
}
