package aula1arranjosbidimensionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int numbers = scanner.nextInt();

        int[][] array = new int[numbers][numbers];

        fillArray(array, numbers);
        mainDiagonal(array, numbers);
        findNegativeNumbers(array, numbers);
    }

    public static void fillArray(int[][] array, int numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j < numbers; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mainDiagonal(int[][] array, int numbers) {
        System.out.println("Main Diagonal");
        for (int i = 0; i < numbers; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
    }

    public static void findNegativeNumbers(int[][] array, int numbers) {
        int negativeCounter = 0;
        for (int i = 0; i < numbers; i++) {
            for (int j = 0; j < numbers; j++) {
                if(array[i][j] < 0){
                    negativeCounter++;
                }
            }
        }

        System.out.println("Negative numbers quantity: " + negativeCounter);
    }
}