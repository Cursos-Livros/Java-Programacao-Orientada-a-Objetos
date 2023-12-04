package exercicios.exercicio3.application;

import exercicios.exercicio3.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int inputQuantitiyPerson = scanner.nextInt();

        Person[] arrayPersons = new Person[inputQuantitiyPerson];

        for (int i = 0; i < arrayPersons.length; i++) {
            System.out.printf("Dados da %da pessoa: %n", i + 1);
            scanner.nextLine();
            System.out.println("Nome: ");
            String name = scanner.nextLine();
            System.out.println("Idade:");
            int age = scanner.nextInt();
            System.out.println("Altura:");
            double height = scanner.nextDouble();
            arrayPersons[i] = new Person(name, age, height);
        }

        double averageHeight = averageHeightCalculator(arrayPersons);
        System.out.println("Altura Média: " + String.format("%.2f", averageHeight));

        double heightUnder16 = heightUnder16Calculator(arrayPersons);
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", heightUnder16) + "%");

        for (int i = 0; i < arrayPersons.length; i++) {
            if (arrayPersons[i].getAge() < 16) {
                System.out.println(arrayPersons[i].getName());
            }
        }
    }

    public static double averageHeightCalculator(Person[] arrayPersons) {
        double sumHeight = 0.0;

        for (int i = 0; i < arrayPersons.length; i++) {
            sumHeight += arrayPersons[i].getHeight();
        }
        return sumHeight / arrayPersons.length;
    }

    public static double heightUnder16Calculator(Person[] arrayPersons) {
        if (arrayPersons.length == 0) {
            return 0.0;
        }

        int quantityPersonUnder16 = 0;
        for (int i = 0; i < arrayPersons.length; i++) {
            if (arrayPersons[i].getAge() < 16) {
                quantityPersonUnder16++;
            }
        }
        return ((double) quantityPersonUnder16 / arrayPersons.length) * 100;
    }
}
