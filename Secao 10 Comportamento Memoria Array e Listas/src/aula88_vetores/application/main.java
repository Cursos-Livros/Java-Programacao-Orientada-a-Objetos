package aula88_vetores.application;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of vector:");
        int length = input.nextInt();

        double[] vector = new double[length];

        fillVector(vector);
        showVector(vector);
        input.close();
    }

    public static void fillVector(double[] vector) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Enter with a double value:");
            double value = input.nextDouble();

            vector[i] = value;
        }

        input.close();
    }

    public static void showVector(double[] vector) {
        System.out.println("Vector Data:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
