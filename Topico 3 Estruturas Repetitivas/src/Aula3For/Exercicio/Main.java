package Aula3For.Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with a positive number:");
        int inputNumber = scanner.nextInt();

        for (int i = 1; i <= inputNumber; i++) { // Cuida das linha
            for (int j = 1; j <= 3; j++) { // Cuida da quantidade de vezes que aparecera na linha
                int pow = ((int) Math.pow(i, j));
                System.out.printf("%d ",pow);
            }
            System.out.printf("%n");
        }
    }
}
