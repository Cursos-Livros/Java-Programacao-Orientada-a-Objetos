package exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the product quantity:");
        int quantity = Integer.parseInt(input.nextLine());

        Double[] numberList = new Double[quantity];
        fillList(numberList);
        showValues(numberList);
        showSum(numberList);
        showAverage(numberList);
    }

    public static void fillList(Double[] numberList) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numberList.length; i++) {
            System.out.println("Enter with a integer number:");
            double number = Integer.parseInt(input.nextLine());
            numberList[i] = number;
        }

        input.close();
    }

    public static void showValues(Double[] numberList) {
        System.out.println("Values:" + Arrays.toString(numberList));
    }

    public static void showSum(Double[] numberList) {
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];
        }

        System.out.println("Soma: " + sum);
    }

    public static void showAverage(Double[] numberList) {
        double elementSum = 0.0;
        for (int i = 0; i < numberList.length; i++) {
            elementSum += numberList[i];
        }

        System.out.println("Media: " + elementSum / numberList.length);
    }
}
