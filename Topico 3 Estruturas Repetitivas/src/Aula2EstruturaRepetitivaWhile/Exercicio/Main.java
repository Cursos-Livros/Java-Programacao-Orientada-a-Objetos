package Aula2EstruturaRepetitivaWhile.Exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with the code of the product of your preference:");
        int option = 0;

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (option != 4) {
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Alcool");
                    alcool++;
                    break;
                case 2:
                    System.out.println("Gasolina");
                    gasolina++;
                    break;
                case 3:
                    System.out.println("Diesel");
                    diesel++;
                    break;
                case 4:
                    System.out.println("Muito Obrigado!");
                    break;
            }
        }

        System.out.println("Lista de Saída");
        System.out.println("Alcool: " +  alcool);
        System.out.println("Gasolina: " +  gasolina);
        System.out.println("Diesel: " +  diesel);
    }
}
