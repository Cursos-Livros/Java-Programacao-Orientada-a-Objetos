package exercicios.exercicio4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz?");
        int order = scanner.nextInt();
        checkSize(order);

        int[][] array = fillArray(order);
        checkMaxValue(array, order);
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

    public static int[][] fillArray(int order) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[order][order];

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.printf("Elemento [%d, %d]: %n", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void checkMaxValue(int[][] array, int order) {
        int maxValue = array[0][0];
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
            System.out.println(maxValue);
            maxValue = array[i][0];
        }

    }
}
