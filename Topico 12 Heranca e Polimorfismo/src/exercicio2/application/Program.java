package exercicio2.application;

import exercicio1.entities.Employee;
import exercicio2.entities.ImportedProduct;
import exercicio2.entities.Product;
import exercicio2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int numberProducts = scanner.nextInt();

        List<Product> listProducts = new ArrayList<>();

        for (int i = 0; i < numberProducts; i++) {
            System.out.println("Product" + (i + 1) + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char typeProduct = scanner.next().charAt(0);

            while (!testTypeProduct(typeProduct)) {
                System.out.println("This option doesnt exist!");
                System.out.println("Use (c/u/i)!");
                typeProduct = scanner.next().charAt(0);
            }

            System.out.println("Name:");
            scanner.nextLine();
            String nameProduct = scanner.nextLine();
            System.out.println("Price:");
            double priceProduct = scanner.nextDouble();

            if (typeProduct == 'c') {
                listProducts.add(Product.makeCommomProduct(nameProduct, priceProduct));
            } else if (typeProduct == 'u') {
                listProducts.add(usedProduct(nameProduct, priceProduct));
            } else if (typeProduct == 'i') {
                System.out.println("Customs fee:");
                double customFee = scanner.nextDouble();
                listProducts.add(importedProduct(nameProduct, priceProduct, customFee));
            }
        }

        System.out.println("PRICE TAGS:");
        showPriceTags(listProducts);
    }


    public static Boolean testTypeProduct(char typeProduct) {
        if (typeProduct == 'c' || typeProduct == 'u' || typeProduct == 'i') {
            return true;
        }
        return false;
    }

//    public static Product commomProduct(String nameProduct, Double priceProduct) {
//        Product commomProduct = new Product(nameProduct, priceProduct);
//        return commomProduct;
//    }

    public static Product usedProduct(String nameProduct, Double priceProduct) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Manufacture date (DD/MM/YYYY):");
        String manufaturedDate = scanner.nextLine();

        try {
            LocalDate dateParsed = LocalDate.parse(manufaturedDate, formatter);
            Product usedProduct = new UsedProduct(nameProduct, priceProduct, dateParsed);
            return usedProduct;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in DD/MM/YYYY format.");
            return null; // Ou faça algo para lidar com a situação, como pedir ao usuário para fornecer a data novamente.
        }
    }

    public static Product importedProduct(String nameProduct, Double priceProduct, Double customFee) {
        Product importedProduct = new ImportedProduct(nameProduct, priceProduct, customFee);
        return importedProduct;
    }

    public static void showPriceTags(List<Product> listProducts) {
        for (Product product : listProducts) {
            System.out.println(product.priceTag());
        }
    }
}
