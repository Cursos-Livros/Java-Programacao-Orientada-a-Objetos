package Desafio.application;

import Desafio.entities.TaxPayer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos contribuintes você vai digitar?");
        int numberTaxPayers = scanner.nextInt();

        ArrayList<TaxPayer> listTaxPayer = new ArrayList<>();

        fillTaxPayerList(listTaxPayer, numberTaxPayers);

        taxPayerResume(listTaxPayer);
    }

    public static void fillTaxPayerList(ArrayList<TaxPayer> listTaxPayer, int numberTaxPayers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberTaxPayers; i++) {
            System.out.printf("Digite os dados do %do contribuinte:%n", i + 1);
            System.out.println("Renda anual com salário:");
            double anualSalary = scanner.nextDouble();
            System.out.println("Renda anual com prestação de serviço:");
            double serviceIncome = scanner.nextDouble();
            System.out.println("Renda anual com ganho de capital:");
            double anualCapitalIncome = scanner.nextDouble();
            System.out.println("Gastos Medicos:");
            double anualHealthBill = scanner.nextDouble();
            System.out.println("Gastos educacionais:");
            double anualEducationalBills = scanner.nextDouble();

            TaxPayer taxpayer = new TaxPayer(anualSalary, serviceIncome, anualCapitalIncome, anualHealthBill, anualEducationalBills);

            listTaxPayer.add(taxpayer);
        }
    }

    public static void taxPayerResume(ArrayList<TaxPayer> listTaxPayer) {
        int i = 0;
        for (TaxPayer taxpayer : listTaxPayer) {
            i++;
            System.out.printf("Resumo do %do contribuinte: %n", i);
            System.out.printf("Imposto bruto total: %.2f %n", taxpayer.grossTax());
            System.out.printf("Abatimento: %.2f %n", taxpayer.taxRebate());
            System.out.printf("Imposto devido: %.2f %n", taxpayer.netTax());
        }
    }
}
