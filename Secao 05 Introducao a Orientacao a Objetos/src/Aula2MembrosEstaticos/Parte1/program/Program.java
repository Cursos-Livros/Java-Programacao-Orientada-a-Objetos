package Aula2MembrosEstaticos.Parte1.program;

import Aula2MembrosEstaticos.Parte1.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    // Contants don't chance public static final
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();


        // Read radius values
        System.out.println("Enter the radius value:");
        double radius = scanner.nextDouble();

        double circumference = calculator.circumference(radius);

        double volume = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", calculator.PI);

        scanner.close();
    }

}
