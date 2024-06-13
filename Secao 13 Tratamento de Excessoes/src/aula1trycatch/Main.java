package aula1trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Try catch
 * Try - bloco de codigo normal que pode levar a excessao
 * Catch - bloco de codigo que trata a excecao
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vector = scanner.nextLine().split(" ");

            int position = scanner.nextInt();

            System.out.println(vector[position]);

            scanner.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("End of program");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

    }
}