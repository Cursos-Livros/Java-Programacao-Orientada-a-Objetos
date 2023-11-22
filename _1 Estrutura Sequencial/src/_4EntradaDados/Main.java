package _4EntradaDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Atalho sout: atalho para System.out.println

        // Comando que cria um objeto que lê entradas
        Scanner scanner = new Scanner(System.in);

        // Le Strings
        System.out.println("Enter with a string");
        String x = scanner.next();
        System.out.println(x);

        // Le Inteiros
        System.out.println("Enter with a integer:");
        int y = scanner.nextInt();
        System.out.println(y);

        // Le Doubles
        System.out.println("Enter with a double:");
        double z = scanner.nextDouble(); // Relembre que se for Brasil tem que usar, ou usar o set locale
        System.out.println(z);

        // Le Characters
        System.out.println("Enter with a char:");
        char w = scanner.next().charAt(0); // Comando para ler char, é possível notável que le uma string e depois pega o primeiro character
        System.out.println(w);

        // Ler diversos dados em uma mesma linha
        String j = scanner.next();
        int k = scanner.nextInt();
        double l = scanner.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);

        // Ler texto até quebra de linha
        System.out.println("Entre com os dados");
        String a = scanner.nextLine();
        System.out.println(a);

        // Quebra de linha pendente

        // Comando para desalocar objeto
        scanner.close();
    }
}
