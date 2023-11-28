package Desafio.BarOO.program;

import Desafio.BarOO.entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.println("Sexo: ");
        bill.gender = scanner.next().charAt(0);

        System.out.println("Quantidade de cervejas: ");
        bill.beer = scanner.nextInt();

        System.out.println("Quantidade de refrigerantes: ");
        bill.softDrink = scanner.nextInt();

        System.out.println("Quantidade de espetinhos:");
        bill.barbecue = scanner.nextInt();

        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo: R$ %.2f%n", bill.feeding());
        System.out.printf("Ingresso: R$ %.2f%n", bill.ticket());

        System.out.printf("Valor a pagar: R$ %.2f%n", bill.total());
    }
}
