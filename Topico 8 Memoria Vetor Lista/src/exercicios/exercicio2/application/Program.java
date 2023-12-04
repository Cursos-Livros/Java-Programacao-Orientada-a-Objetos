package exercicios.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar");
        int numberQuantitiy = scanner.nextInt();

        double[] arraySum = new double[numberQuantitiy];

        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = scanner.nextInt();
        }

        System.out.println("Valores:");
        for (int i = 0; i < arraySum.length; i++) {
            System.out.println(arraySum[i]);
        }

        double resultSum = sumArray(arraySum);
        System.out.println("Soma: " + resultSum);

        double average = arrayAverage(arraySum, resultSum);
        System.out.println("Media: " + average);
    }

    public static double sumArray(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double arrayAverage(double[] arraySum, double sum) {
        int quantityNumbers = arraySum.length;
        return  sum / quantityNumbers;
    }
}


