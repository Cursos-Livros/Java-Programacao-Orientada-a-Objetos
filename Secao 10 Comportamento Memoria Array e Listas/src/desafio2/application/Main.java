package desafio2.application;

import javax.swing.text.Position;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the line numbers:");
        int lineNumber = input.nextInt();
        System.out.println("Enter with the column numbers:");
        int lineColumn = input.nextInt();

        int[][] multidimensionArray = new int[lineNumber][lineColumn];

        fillMultidimensionArray(multidimensionArray);
        showMultidimensionArray(multidimensionArray);

        System.out.println("Enter with the number to test of 1 - 10:");
        int testNumber = input.nextInt();

        int numberOccurrences = findTestNumberOccurrence(testNumber, multidimensionArray);
        showHowManyTimesFound(testNumber, numberOccurrences);

        int[][] numberOccurrencesPositionList = new int[numberOccurrences][2];
        findNumberOccurrencesPosition(testNumber, multidimensionArray, numberOccurrencesPositionList);
        showOccurrencesPosition(numberOccurrencesPositionList);
    }

    public static void fillMultidimensionArray(int[][] multidimensionArray) {
        Random number = new Random();

        for (int i = 0; i < multidimensionArray.length; i++) {
            for (int j = 0; j < multidimensionArray[i].length; j++) {
                multidimensionArray[i][j] = number.nextInt(10 + 1);
            }
        }
    }

    public static void showMultidimensionArray(int[][] multidimensionArray) {
        for (int i = 0; i < multidimensionArray.length; i++) {
            for (int j = 0; j < multidimensionArray[i].length; j++) {
                System.out.printf("%d ", multidimensionArray[i][j]);
            }
            System.out.println();
        }
    }

    public static int findTestNumberOccurrence(int testNumber, int[][] multidimensionArray) {
        int counter = 0;

        for (int i = 0; i < multidimensionArray.length; i++) {
            for (int j = 0; j < multidimensionArray[i].length; j++) {
                if (multidimensionArray[i][j] == testNumber) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static void showHowManyTimesFound(int testNumber, int numberOccurrences) {
        System.out.println(numberOccurrences + " occurrences of the number " + testNumber + " was found!");
    }

    public static void findNumberOccurrencesPosition(int testNumber, int[][] multidimensionArray, int[][] numberOccurrencesPositionList) {
        int currentIndex = 0;

        for (int i = 0; i < multidimensionArray.length; i++) {
            for (int j = 0; j < multidimensionArray[i].length; j++) {
                if (multidimensionArray[i][j] == testNumber) {
                    numberOccurrencesPositionList[currentIndex][0] = i; // Adiciona o elemento da coluna 0 utilize quando a outra matriz ja tem posicoes fixas
                    numberOccurrencesPositionList[currentIndex][1] = j; // Adiciona o elemento da coluna 1
                    currentIndex++;
                }
            }
        }
    }

    public static void showOccurrencesPosition(int[][] numberOccurrencesPositionList) {
        for (int i = 0; i < numberOccurrencesPositionList.length; i++) {
            System.out.println("Position: " + numberOccurrencesPositionList[i][0] + "," + numberOccurrencesPositionList[i][1]);
        }
    }
}

