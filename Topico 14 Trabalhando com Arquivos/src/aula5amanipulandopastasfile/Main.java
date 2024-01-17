package aula5amanipulandopastasfile;

import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter forder path: ");
        String stringPath = scanner.nextLine();

        // Guarda o caminho e pasta
        File path = new File(stringPath);
        File[] folders = path.listFiles(File::isDirectory);

        // Mostra as pastas
        System.out.println("Folders:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        System.out.println();

        // Guarda arquivos
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files:");
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println();

        // Cria uma subpasta a partir do endereco
        boolean success = new File(stringPath + "\\subdir").mkdir();
        System.out.println("Directory created with successfully: " + success);
        scanner.close();
    }
}
