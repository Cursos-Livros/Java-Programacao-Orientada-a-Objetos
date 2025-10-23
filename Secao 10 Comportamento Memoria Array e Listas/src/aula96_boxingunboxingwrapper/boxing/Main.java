package aula96_boxingunboxingwrapper.boxing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Boxing conversão de um tipo valor para um tipo objeto
        int x = 20;
        Object object = x; // A JVM vai colocar o valor 20 la dentro da heap
        System.out.println(object);

        // Agora se tentar fazer uma variavel tipo valor receber esse valor irá falhar;
        // int y = object;
        int y = (int) object; // Obrigado a fazer um cast para o tipo do objeto
    }
}
