package Aula2MembrosEstaticos.Parte2.program;

import Aula2MembrosEstaticos.Parte2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();


        // Read radius values
        System.out.println("Enter the radius value:");
        double radius = scanner.nextDouble();

        double circumference = Calculator.circumference(radius);

        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }
}
