package Exercicios.Exercicio1.entities;

public class Rectangle {
    public double width = 0.0;
    public double height = 0.0;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        double pitagoras = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(pitagoras);
    }
}
