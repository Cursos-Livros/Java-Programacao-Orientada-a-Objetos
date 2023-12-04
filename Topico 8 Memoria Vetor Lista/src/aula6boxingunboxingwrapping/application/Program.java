package aula6boxingunboxingwrapping.application;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Boxing
        int x = 20;
        Object object = x;

        // Unboxing
        int y = (int) object;

        System.out.println(x);
        System.out.println(y);

        // Wrappe
        int i = 12;
        Object store = i; // 1 fazemos o boxing
        Integer storeBoxing = i; // não necessita de cast
    }
}
