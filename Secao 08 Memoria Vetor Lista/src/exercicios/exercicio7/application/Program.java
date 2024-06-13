package exercicios.exercicio7.application;

import exercicios.exercicio3.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numberQuantity = scanner.nextInt();

        double[] arrayNumber = new double[numberQuantity];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Digite um numero:");
            arrayNumber[i] = scanner.nextDouble();
        }

        double average = averageCalculator(arrayNumber);

        System.out.println("MEDIA DO VETOR = " + average);

        UnderAverageElements(arrayNumber, average);

    }

    public static double averageCalculator(double[] arrayNumber) {
        double sum = 0.0;

        for (int i = 0; i < arrayNumber.length; i++) {
            sum += arrayNumber[i];
        }
        return sum / arrayNumber.length;
    }

    public static void UnderAverageElements(double[] arrayNumber, double average) {
        double elementUnderAverage = average;

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] < elementUnderAverage ) {
                elementUnderAverage = arrayNumber[i];
                System.out.printf("%.1f%n",elementUnderAverage);
            }
        }
    }
}
