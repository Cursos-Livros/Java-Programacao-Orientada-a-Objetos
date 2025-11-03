package aula113_DataHoraLocalParaGlobal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // Converter Data - Hora global para local
        // Precisa informar timezone

        LocalDate date01 = LocalDate.parse("2026-11-03");
        LocalDateTime date2 = LocalDateTime.parse("2025-11-03T16:30:30");
        Instant date03 = Instant.parse("2025-11-03T01:30:30Z");

        LocalDate result01 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        System.out.println("LocalDate máquina atual: " + result01); // Só não se esqueça que leva em conta o horário do timezone aqui no caso o de Londres

        // Coleção com a quantidade de locais com fuso-horário
        System.out.println("Available Zone Ids:");
        for (String local : ZoneId.getAvailableZoneIds()) {
            System.out.println(local);
        }
    }
}
