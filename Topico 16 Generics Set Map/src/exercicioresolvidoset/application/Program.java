package exerciciofixacaoset.application;

import exerciciofixacaoset.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full path");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> set = new HashSet<>();

            String line = bufferedReader.readLine();

            while (line != null) {
                String[] field = line.split(" ");
                String username = field[0];
                Instant moment = Instant.parse(field[1]);

                set.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }
            System.out.println("Total Users: " + set.size());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
