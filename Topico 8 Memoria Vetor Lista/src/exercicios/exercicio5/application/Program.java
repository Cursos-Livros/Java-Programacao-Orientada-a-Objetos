package exercicios.exercicio5.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int numberQuantity = scanner.nextInt();

        double[] arrayNumber = new double[numberQuantity];

        double[] newArray = fillArray(arrayNumber);

        double maximumValue = maximumValueCalculator(newArray);
        System.out.println("MAIOR VALOR = " + maximumValue);

        int maximumValueIndex = maximumValueIndexCalculator(newArray, maximumValue);
        System.out.println("POSICAO DO MAIOR VALOR: " + maximumValueIndex);
    }

    public static double[] fillArray(double[] arrayNumber) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.println("Digite um numero:");
            arrayNumber[i] = scanner.nextDouble();
        }
        return arrayNumber;
    }

    public static double maximumValueCalculator(double[] newArray) {
        double maximumValue = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > maximumValue) {
                maximumValue = newArray[i];
            }
        }
        return maximumValue;
    }

    public static int maximumValueIndexCalculator(double[] newArray, double maximumValue) {
        int valueIndex = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] ==  maximumValue) {
                valueIndex = i;
                break;
            }
        }
        return valueIndex;
    }
}
