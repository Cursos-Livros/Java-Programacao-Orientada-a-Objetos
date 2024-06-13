package Aula2EstruturaRepetitivaWhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // While
        // Usada quando não se sabe a quantidade de vezes que as repetições serão usadas

        int x = scanner.nextInt();

        // While so repete o bloco enquanto a condicação for verdadeira
        while (x != 10) {
            x = scanner.nextInt();
        }
    }
}
