package exercicioproposto;

import exercicioproposto.entities.Product;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        menu();

        scanner.close();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\exercicioproposto\\in.txt";

        System.out.println("Enter quantity of products you need enter:");
        int quantityItemsLaunch = scanner.nextInt();


        List<Product> products = new ArrayList<>();
        products = itemsLaunch(quantityItemsLaunch, products);
        writeFile(products, path);
        summaryTotal(path);
    }

    public static List<Product> itemsLaunch(int quantityItemsLaunch, List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        Product product;

        try {
            for (int i = 0; i < quantityItemsLaunch; i++) {
                System.out.println("Enter the name of the product:");
                String nameproduct = scanner.nextLine();

                System.out.println("Enter the price of the product:");
                double productPrice = scanner.nextDouble();

                System.out.println("Enter the product quantity:");
                int productQuantity = scanner.nextInt();

                product = new Product(nameproduct, productPrice, productQuantity);
                products.add(product);

                scanner.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return products;
    }

    public static void writeFile(List<Product> products, String path) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (Product product : products) {
                bufferedWriter.write(product.toString());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void summaryTotal(String enterPath) {
        String outPath = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\exercicioproposto\\out\\summary.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(enterPath));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outPath))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] lineSeperated = line.split(",");
                String total = productCalculator(lineSeperated[0], lineSeperated[1], lineSeperated[2]);
                bufferedWriter.write(total);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String productCalculator(String name, String price, String quantity) {
        String total = String.valueOf((Double.parseDouble(price) * Integer.parseInt(quantity)));

        return name + "," + total;
    }
}
