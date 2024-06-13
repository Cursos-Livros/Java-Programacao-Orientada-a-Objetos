package exercicios.exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros você deseja digitar?");
        int numbers = scanner.nextInt();

        int[] array = new int[numbers];

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o %d numero:%n", i+1);
            array[i] = scanner.nextInt();
        }

        System.out.println("Quantidade numeros negativos:");
        printNegatives(array);
    }

    public static void printNegatives(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                System.out.println(array[i]);
            }
        }
    }
}
