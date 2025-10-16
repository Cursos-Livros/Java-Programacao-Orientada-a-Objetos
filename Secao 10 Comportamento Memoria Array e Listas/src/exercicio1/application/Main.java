package exercicio1.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the product quantity:");
        int quantity = Integer.parseInt(input.nextLine());

        Integer[] numberList = new Integer[quantity];

        fillList(numberList);
        int negativeQuantity = calculateNegativeQuantity(numberList);

        System.out.println("The quantity of negative number is: " + negativeQuantity + " numbers.");
        input.close();
    }

    public static void fillList(Integer[] numberList) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numberList.length; i++) {
            System.out.println("Enter with a integer number:");
            int number = Integer.parseInt(input.nextLine());
            numberList[i] = number;
        }

        input.close();
    }

    public static int calculateNegativeQuantity(Integer[] numberList) {
        int negativeNumber = 0;

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] < 0) {
                negativeNumber++;
            }
        }

        return negativeNumber;
    }
}
