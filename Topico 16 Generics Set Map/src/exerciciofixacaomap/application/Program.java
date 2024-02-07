package exerciciofixacaomap.application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full path");
        String path = scanner.nextLine();

        Map<String, Integer> cadidatesVotes = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] field = line.split(",");
                String name = field[0];
                int currentVote = Integer.parseInt(field[1]);

                if (cadidatesVotes.containsKey(name)) {
                    int oldVotes = cadidatesVotes.get(name);
                    cadidatesVotes.put(name,currentVote + oldVotes);
                }else{
                    cadidatesVotes.put(name, currentVote);
                }

                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (String key : cadidatesVotes.keySet()) {
            System.out.println(key + ":" + cadidatesVotes.get(key));
        }
    }
}
