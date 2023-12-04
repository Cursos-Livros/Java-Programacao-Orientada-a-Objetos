package aula4vetores.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        // Iniciar vetor
        double[] array = new double[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
    }
}