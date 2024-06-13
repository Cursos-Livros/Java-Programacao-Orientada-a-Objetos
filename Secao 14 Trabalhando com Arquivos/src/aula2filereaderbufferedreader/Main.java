package aula2filereaderbufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\in.txt.txt";
        FileReader fileReader = null; // Leitor de stream de caracteres
        BufferedReader bufferedReader = null; // Le file reader de maneira mais otimizada

        try {
            fileReader = new FileReader(path); // Instancia um objeto file e passa o caminho do arquivo
            bufferedReader = new BufferedReader(fileReader); // Instancia um objeto buffered reader e passa a stream filereader pra ele

            String line = bufferedReader.readLine(); // Recebe uma sequencia de caracter até o espaço

            while (line != null) { // Verifica se a linha não é nula
                System.out.println(line);
                line = bufferedReader.readLine(); // Recebe uma nova sequencia de caracteres
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            // Bloco try cach para fechar os objetos instanciados anteriormente
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
