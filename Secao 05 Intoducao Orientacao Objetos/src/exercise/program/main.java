package exercise.program;

import exercise.entites.Rectangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.printf("Area = %.2f", rectangle.area());
        System.out.printf("Perimeter = %.2f", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f", rectangle.diagonal());

        input.close();
    }
}
