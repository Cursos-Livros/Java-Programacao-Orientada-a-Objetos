package exemplo3MembrosEstaticos.application;

import java.util.Scanner;

public class Main {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius value:");
        double radius = input.nextDouble();

        double c = circumference(radius);
        double volume = volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", PI);

        input.close();
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
