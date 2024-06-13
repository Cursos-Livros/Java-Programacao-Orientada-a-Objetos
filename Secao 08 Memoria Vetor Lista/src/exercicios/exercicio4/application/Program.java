package exercicios.exercicio4.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numberQuantity = scanner.nextInt();

        int[] arrayNumber = new int[numberQuantity];

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = scanner.nextInt();
        }

       int evenNumbers = evenCaluculator(arrayNumber);

        System.out.println("Quantidade de pares = " + evenNumbers);
    }

    public static int evenCaluculator(int[] arrayNumber) {
        int evenNumbers = 0;
        System.out.println("Quantidade numeros pares:");
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0) {
                System.out.println(arrayNumber[i]);
                evenNumbers++;
            }
        }
        return evenNumbers;
    }
}
