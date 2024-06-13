package aula7metodosabstratos.program;

import aula7metodosabstratos.entities.Circle;
import aula7metodosabstratos.entities.Retangle;
import aula7metodosabstratos.entities.Shape;
import aula7metodosabstratos.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of shapes:");
        int numberShapes = scanner.nextInt();

        List<Shape> listShape = new ArrayList<>();

        for (int i = 0; i < numberShapes; i++) {
            System.out.println("Shape " + (i + 1) + " data:");

            System.out.println("Rectangle or Circle (r/c)?");
            char shapeOption = scanner.next().charAt(0);
            testshape(shapeOption);

            System.out.println("Color (BLACK/BLUE/RED):");
            scanner.nextLine();
            String colorOption = scanner.nextLine();
            testColor(colorOption);

            fillShapeList(shapeOption, colorOption.toUpperCase(), listShape);
        }

        System.out.println("SHAPE AREAS:");
        showAreas(listShape);

        scanner.close();
    }

    public static char testshape(char shapeOption) {
        if (shapeOption != 'r' && shapeOption != 'c') {
            return fixShapeError(shapeOption);
        }
        return shapeOption;
    }


    public static char fixShapeError(char shapeOption) {
        Scanner scanner = new Scanner(System.in);

        char shapeOptionResult = shapeOption;

        while (shapeOptionResult != 'r' && shapeOptionResult != 'c') {
            System.out.println("Try again!");
            System.out.println("Rectangle or Circle (r/c)?");
            shapeOptionResult = scanner.next().charAt(0);
        }
        return shapeOptionResult;
    }

    public static String testColor(String colorOption) {
        if (!colorOption.toUpperCase().equals("BLACK") && !colorOption.toUpperCase().equals("BLUE") && !colorOption.toUpperCase().equals("RED")) {
            return fixColor(colorOption);
        }
        return colorOption;
    }

    public static String fixColor(String colorOption) {
        Scanner scanner = new Scanner(System.in);
        String newColorOption = colorOption;

        while (!newColorOption.toUpperCase().equals("BLACK") && !newColorOption.toUpperCase().equals("BLUE") && !newColorOption.toUpperCase().equals("RED")) {
            System.out.println("Enter the color again:");
            System.out.println("Color (BLACK/BLUE/RED):");
            newColorOption = scanner.nextLine();
        }

        return newColorOption;
    }

    public static List<Shape> fillShapeList(char shapeOption, String colorOption, List<Shape> listShape) {
        if (shapeOption == 'r') {
            listShape.add(rectangle(colorOption));
        } else {
            listShape.add(circle(colorOption));
        }
        return listShape;
    }

    public static Shape rectangle(String colorOption) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with the width:");
        double width = scanner.nextDouble();

        System.out.println("Enter with the height:");
        double height = scanner.nextDouble();


        Shape rectangle = new Retangle(Color.valueOf(colorOption), width, height);

        return rectangle;
    }

    public static Shape circle(String colorOption) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with the radius:");
        double radius = scanner.nextDouble();

        Shape circle = new Circle(Color.valueOf(colorOption), radius);

        return circle;
    }

    public static void showAreas(List<Shape> listShape) {
        for (Shape shape : listShape) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}


