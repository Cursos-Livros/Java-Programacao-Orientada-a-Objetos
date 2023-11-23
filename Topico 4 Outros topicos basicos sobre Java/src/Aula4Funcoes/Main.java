package Aula4Funcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
        scanner.close();
    }

    private static int max(int a, int b, int c) {
        int aux = 0;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    private static void showResult(int higher) {
        System.out.println("The higher number is: " + higher);
    }
}



