package exercicios.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the line size");
        int line = scanner.nextInt();
        checkSize(line);

        System.out.println("Enter the column size");
        int column = scanner.nextInt();
        checkSize(column);

        double[][] array = fillArray(line, column);
        double[] arraySum = arraySum(array, line, column);

        showArraySum(arraySum);
    }

    public static void checkSize(int size) {
        int newSize = size;
        Scanner scanner = new Scanner(System.in);
        if (size < 0 || size > 10) {
            System.out.println("This size is not permitted:");
            while (newSize == size) {
                System.out.println("Enter the another size:");
                size = scanner.nextInt();
            }
        }
    }

    public static double[][] fillArray(int line, int column) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[line][column];

        for (int i = 0; i < line; i++) {
            System.out.printf("Digite os elementos da %da. linha:%n", i + 1);
            for (int j = 0; j < column; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        return array;
    }

    public static double[] arraySum(double[][] array, int line, int column) {
        double[] sumArray = new double[line];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                sumArray[i] += array[i][j];
            }
        }
        return sumArray;
    }

    public static void showArraySum(double[] arraySum) {

        for (double number : arraySum) {
            System.out.println(number);
        }
    }
}
