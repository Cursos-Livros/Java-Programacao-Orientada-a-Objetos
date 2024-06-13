package aula6informacoescaminhoarquivo;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file path:");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        // Mostra somente o nome do arquivo
        System.out.println("get name = " + path.getName());

        // Mostra somente o nome do caminho
        System.out.println("get parent = " + path.getParent());

        // Mostra o caminho e o nome do caminho
        System.out.println("get path = " + path.getPath());
    }
}
