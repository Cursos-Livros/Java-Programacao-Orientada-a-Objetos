package exercicio3.program;

import exercicio3.entities.Company;
import exercicio3.entities.Individual;
import exercicio3.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of tax payers:");
        int numberTaxPayer = scanner.nextInt();

        List<TaxPayer> listTaxPayer = new ArrayList<>();

        for (int i = 0; i < numberTaxPayer; i++) {
            System.out.println("Tax payer " + (i + 1) + " data:");
            System.out.println("Individual or company (i/c)?");
            char typeTaxPayerOption = readTypeTaxPayerOption();
            System.out.println("Name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Anual income:");
            double anualIncome = readAnualIncome();
            listTaxPayer.add(typeTaxPayer(name, typeTaxPayerOption, anualIncome));
        }

        System.out.println("TAXES PAID:");
        showTaxesPayer(listTaxPayer);
    }

    public static char readTypeTaxPayerOption() {
        Scanner scanner = new Scanner(System.in);
        char typeTaxPayerOption = scanner.next().charAt(0);
        return testTypeTaxPayerOption(typeTaxPayerOption);
    }

    public static char testTypeTaxPayerOption(char typeTaxPayerOption) {
        char newTypeTaxPayerOption = typeTaxPayerOption;
        if (newTypeTaxPayerOption != 'i' && newTypeTaxPayerOption != 'c') {
            newTypeTaxPayerOption = TypeTaxPayerOptionError(typeTaxPayerOption);
        }
        return newTypeTaxPayerOption;
    }

    public static char TypeTaxPayerOptionError(char typeTaxPayerOption) {
        Scanner scanner = new Scanner(System.in);
        char newTypeTaxPayerOption = typeTaxPayerOption;
        while (newTypeTaxPayerOption != 'i' && newTypeTaxPayerOption != 'c') {
            System.out.println("The type of tax payer not exist!");
            System.out.println("Is just Individual or company (i/c) so enter option again?");
            newTypeTaxPayerOption = scanner.next().charAt(0);
        }

        return newTypeTaxPayerOption;
    }

    public static Double readAnualIncome() {
        Scanner scanner = new Scanner(System.in);
        double anualIncome = scanner.nextDouble();
        return testAnualIncome(anualIncome);
    }

    public static Double testAnualIncome(Double anualIncome) {
        double newAnualIncome = anualIncome;
        if (anualIncome < 0) {
            newAnualIncome = anualIncomeError(anualIncome);
        }
        return newAnualIncome;
    }

    public static Double anualIncomeError(Double anualIncome) {
        Scanner scanner = new Scanner(System.in);
        double newAnualIncome = anualIncome;
        while (newAnualIncome < 0.0) {
            System.out.println("The number is less 0 and not permitted: (Enter with number great than 0)");
            newAnualIncome = scanner.nextDouble();
        }
        return newAnualIncome;
    }

    public static TaxPayer typeTaxPayer(String name, char typeTaxPayerOption, double anualIncome) {
        TaxPayer newTaxPayer;
        double individualValueTax = 0.0;
        int companyNumberEmployee;

        if (typeTaxPayerOption == 'i') {
            individualValueTax = individual();
            newTaxPayer = new Individual(name, anualIncome, individualValueTax);
        } else {
            companyNumberEmployee = company();
            newTaxPayer = new Company(name, anualIncome, companyNumberEmployee);
        }
        return newTaxPayer;
    }

    public static Double individual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Health expenditures:");
        return scanner.nextDouble();
    }

    public static Integer company() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of employees:");
        return scanner.nextInt();
    }

    public static void showTaxesPayer(List<TaxPayer> listTaxPayer) {
        double sumTotalTax = 0.0;
        for (TaxPayer taxPayer : listTaxPayer) {
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
            sumTotalTax += taxPayer.tax();
        }

        System.out.println("TOTAL TAXES:");
        System.out.printf("%.2f%n", sumTotalTax);
    }
}
