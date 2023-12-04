package exercicios.exercicio10.application;

import exercicios.exercicio10.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Serao digitados dados de quantos produtos??");
        int numberQuantity = scanner.nextInt();
        scanner.nextLine();

        Products[] arrayProducts = new Products[numberQuantity];

        for (int i = 0; i < arrayProducts.length; i++) {
            System.out.printf("Product %d: %n", i + 1);
            System.out.println("Nome:");
            String inputName = scanner.nextLine();
            System.out.println("Preço de compra:");
            double inputBuyPrice = scanner.nextDouble();
            System.out.println("Preço de venda:");
            double inputSellPrice = scanner.nextDouble();
            scanner.nextLine();
            arrayProducts[i] = new Products(inputName, inputBuyPrice, inputSellPrice);
        }

        System.out.println("Relatório");
        profitReport(arrayProducts);
        totalValue(arrayProducts);
    }

    public static void profitReport(Products[] arrayProducts) {
        int under10Profit = 0;
        int between1020Profit = 0;
        int beyond20 = 0;

        for (int i = 0; i < arrayProducts.length; i++) {
            if (arrayProducts[i].calculatorProfit() < 10) {
                under10Profit++;
            } else if (arrayProducts[i].calculatorProfit() >= 10 && arrayProducts[i].calculatorProfit() <= 20) {
                between1020Profit++;
            } else {
                beyond20++;
            }
        }

        System.out.println("Lucro abaixo de 10%: " + under10Profit);
        System.out.println("Lucro entre 10% e 20%: " + between1020Profit);
        System.out.println("Lucro acima de 20%: " + beyond20);
    }

    public static void totalValue(Products[] arrayProducts) {
        double totalValueBuy = 0.0;
        double totalValueSell = 0.0;

        for (int i = 0; i < arrayProducts.length; i++) {
            totalValueBuy += arrayProducts[i].getBuyPrice();
            totalValueSell += arrayProducts[i].getSellPrice();
        }

        System.out.println("Valor total de compra: " + totalValueBuy);
        System.out.println("Valor total de venda: " + totalValueSell);
        System.out.println("Lucro total: " + (totalValueSell - totalValueBuy));
    }

}
