package Desafio.application;

import Desafio.entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.println("Nome:");
        String inputName = scanner.nextLine();
        System.out.println("Vida inicial:");
        int inputLife = scanner.nextInt();
        System.out.println("Ataque:");
        int inputAtack = scanner.nextInt();
        System.out.println("Armadura:");
        int inputArmor = scanner.nextInt();

        Champion champion1 = new Champion(inputName, inputLife, inputAtack, inputArmor);

        System.out.println("Digite os dados do segundo campeão:");
        System.out.println("Nome:");
        scanner.nextLine();
        String inputName2 = scanner.nextLine();
        System.out.println("Vida inicial:");
        int inputLife2 = scanner.nextInt();
        System.out.println("Ataque:");
        int inputAtack2 = scanner.nextInt();
        System.out.println("Armadura:");
        int inputArmor2 = scanner.nextInt();

        Champion champion2 = new Champion(inputName2, inputLife2, inputAtack2, inputArmor2);

        System.out.println("Quantos turnos deseja jogar:");
        int turnNumbers = scanner.nextInt();

        for (int i = 0; i < turnNumbers; i++) {
            System.out.println("Resultado turno " + i + ":");
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            System.out.println(champion1.status());
            System.out.println(champion2.status());
        }

        System.out.println("FIM DO COMBATE");

    }
}
