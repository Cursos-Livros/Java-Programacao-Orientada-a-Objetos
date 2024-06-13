package exercicios.Program7.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz?");
        int order = scanner.nextInt();
        checkSize(order);

        double[][] array = fillArray(order);

        double resulsumArray = positiveSum(order, array);
        System.out.println("SOMA DOS POSITIVOS: " + resulsumArray);

        System.out.println("Escolha um linha:");
        int lineChoice = scanner.nextInt();
        printAllLine(lineChoice, order, array);

        System.out.println("Escolha um coluna:");
        int columnChoice = scanner.nextInt();
        printAllColumn(columnChoice, order, array);

        System.out.println("DIAGONAL PRINCIPAL:");
        printMainDiagonal(order, array);

        System.out.println("Matriz Alterada:");
        printChangeMatriz(order, array);
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

    public static double[][] fillArray(int order) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[order][order];

        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.printf("Elemento [%d, %d]: %n", i, j);
                array[i][j] = scanner.nextDouble();
            }
        }

        return array;
    }

    public static double positiveSum(int order, double[][] array) {
        double sumArray = 0;
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (array[i][j] > 0) {
                    sumArray += array[i][j];
                }
            }
        }
        return sumArray;
    }

    public static void printAllLine(int lineChoice, int order, double[][] array) {
        for (int i = lineChoice; i < order; i++) {
            for (int j = 0; j < order; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
            break;
        }
    }

    public static void printAllColumn(int columnChoice, int order, double[][] array) {
        int indexColumn = columnChoice;
        for (int i = 0; i < order; i++) {
            System.out.print(array[i][indexColumn]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void printMainDiagonal(int order, double[][] array) {
        for (int i = 0; i < order; i++) {
            System.out.print(array[i][i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void printChangeMatriz(int order, double[][] array) {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = Math.pow(array[i][j], 2.0);
                }
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

