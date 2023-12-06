package exercicios.exercicio5.application;

import java.util.Locale;
import java.util.Scanner;

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

        System.out.println("Digite os valores da matriz A:");
        int[][] arrayA = fillArray(line, column);
        System.out.println("Digite os valores da matriz B:");
        int[][] arrayB = fillArray(line, column);

        System.out.println("Matriz Soma:");
        sumArray(arrayA, arrayB, line, column);
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

    public static int[][] fillArray(int line, int column) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[line][column];

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {
                System.out.printf("Elemento [%d, %d]: %n", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }

    public static void sumArray(int[][] arrayA, int[][] arrayB, int line, int column) {
        int[][] arrayReceiveSum = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arrayReceiveSum[i][j] += (arrayA[i][j] + arrayB[i][j]);
                System.out.print(arrayReceiveSum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
