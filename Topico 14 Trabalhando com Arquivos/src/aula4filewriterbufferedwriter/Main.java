package aula4filewriterbufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{"Yuji Itadori",
                "Megumi Fushiguro",
                "Nobara Kugisaki",
                "Satoru Gojo",
                "Sukuna",
                "Maki Zenin",
                "Panda",
                "Toge Inumaki",
                "Kento Nanami",
                "Aoi Todo","Nanamin" };

        String path = "C:\\Users\\JV\\Documents\\Desenvolvimento\\Java-Programacao-Orientada-a-Objetos\\Topico 14 Trabalhando com Arquivos\\src\\aula5filewriterbufferedwriter\\listapersonagens.txt";

        // true parametro utilizando quando nao se quer criar um arquivo novamente
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Criado");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
