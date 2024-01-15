package aula2pilhachamadametodostacktrace;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Try catch
 * Try - bloco de codigo normal que pode levar a excessao
 * Catch - bloco de codigo que trata a excecao
 */
public class Main {
    public static void main(String[] args) {


        method1();


    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Method 1 Start ---");

        method2();

        System.out.println("---Method 1 End ---");
    }

    public static void method2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Method 2 Start ---");

        try {
            String[] vector = scanner.nextLine().split(" ");

            int position = scanner.nextInt();

            System.out.println(vector[position]);

            scanner.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("End of program");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }

        System.out.println("---Method 2 End ---");
    }
}