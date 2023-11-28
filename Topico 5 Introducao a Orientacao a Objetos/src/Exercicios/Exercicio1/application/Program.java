package Exercicios.Exercicio1.application;

import Exercicios.Exercicio1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle retangle = new Rectangle();

        System.out.println("Enter rectangle width:");
        retangle.width = scanner.nextDouble();

        System.out.println("Enter rectangle width:");
        retangle.height = scanner.nextDouble();

        System.out.println("Area = " + retangle.area());
        System.out.println("Perimeter =  " + retangle.perimeter());
        System.out.println("Diagonal = " + retangle.diagonal());

        scanner.close();
    }
}
