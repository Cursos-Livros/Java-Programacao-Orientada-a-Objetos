package exercicioproposto;

import exercicioproposto.entities.Product;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\exercicioproposto\\in.txt";
        String inputPath = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\exercicioproposto\\in.txt";
        String outputPath = "\\C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\exercicioproposto\\out\\summary.txt";

        List<Product> products = menu(scanner);
        writeFile(products, path);
        List<String> inputLine = readLines(path);
        writeSummary(inputLine, outputPath);
        scanner.close();
    }

    public static List<Product> menu(Scanner scanner) {
        System.out.println("Enter quantity of products you need enter:");
        int quantityItemsLaunch = scanner.nextInt();

        scanner.nextLine();

        List<Product> products = new ArrayList<>();
        products = itemsLaunch(quantityItemsLaunch, scanner);

        return products;
    }

    public static List<Product> itemsLaunch(int quantityItemsLaunch, Scanner scanner) {
        List<Product> products = new ArrayList<>();
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


    public static List<String> readLines(String inputPath) {
        List<String> lineRegister = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))) {
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] lineSeparated = line.split(",");
                String lineJoined = lineSeparated[0] + "," + lineSeparated[1] + "," + lineSeparated[2];
                lineRegister.add(lineJoined);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lineRegister;
    }

    public static void writeSummary(List<String> inputList, String outputPath) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath, true))) {
            for (String product : inputList) {
                String[] separatedRegisterInput = product.split(",");
                String name = separatedRegisterInput[0];
                Double price = Double.valueOf(separatedRegisterInput[1]);
                Double quantity = Double.valueOf(separatedRegisterInput[2]);

                String joinedRegisterInput = productCalculator(name, price, quantity);

                bufferedWriter.write(joinedRegisterInput);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String productCalculator(String name, double price, double quantity) {
        String total = String.valueOf(price * quantity);
        return name + "," + total;
    }
}
