package aula3blocotryresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\in.txt.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine(); // Recebe uma sequencia de caracter até o espaço

            while (line != null) { // Verifica se a linha não é nula
                System.out.println(line);
                line = bufferedReader.readLine(); // Recebe uma nova sequencia de caracteres
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
