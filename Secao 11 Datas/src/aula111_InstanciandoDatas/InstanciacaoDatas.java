package aula111_InstanciandoDatas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class InstanciacaoDatas {
    public static void main(String[] args) {
        // Como instanciar Data - Hora

        // Localdate - Sem timezone
        // Hora Global - Instant

        LocalDate date1 = LocalDate.now();
        System.out.println("LocalDate no timezone: " + date1);

        LocalDateTime date2 = LocalDateTime.now();
        System.out.println("LocalDate and Time no timezone: " + date2);

        Instant date3 = Instant.now(); // com time zone
        System.out.println("Instant timezone - London it's a set:" + date3);

        LocalDate date4 = LocalDate.parse("2025-10-30");
        System.out.println(date4);

        Instant date5 = Instant.parse("2025-10-30T20:28:30-03:00");
        System.out.println("Parsing Brazilian america Sao Paulo in a London time:" + date5);




    }
}