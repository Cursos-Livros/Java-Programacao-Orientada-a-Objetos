package _2SaídaDadosJava;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Formatted Option
        double x = 1.1111;
        System.out.printf("%.2f%n", x); // Use printf para formatar a saída e %n para quebrar a linha

        // Comando para utilizar a formatação americana
        Locale.setDefault(Locale.US);

        // Concatenar saída
        System.out.println("Resultado = " + x + "Metros");

        // Saída Comum
        String name = "Jose";
        Integer idade = 19;
        Double peso = 138.3;

        System.out.printf("%s tem %d e pesa %.1f Kgs", name, idade, peso);
    }
}
