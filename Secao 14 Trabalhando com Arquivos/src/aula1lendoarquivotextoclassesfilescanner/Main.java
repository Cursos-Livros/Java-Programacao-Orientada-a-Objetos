package aula1lendoarquivotextoclassesfilescanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Abstracao para ler um arquivo
        File file = new File("C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\in.txt.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file); // Intancia o objeto scanner para ser capaz de ler um arquivo

            while (scanner.hasNextLine()) { // Verifica se existem linhas no arquivo
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) { // Captura a excessao caso ahaja
            System.out.println("Error" + e.getMessage());
        } finally { // Fecha o scanner caso ele tenha sido instanciado
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}