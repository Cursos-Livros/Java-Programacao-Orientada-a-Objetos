package aula1;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static <LocaleDate> void main(String[] args) {
        // Instanciar data

        // Instanciar hora local
        LocalDate date1 = LocalDate.now();
        System.out.println("Hora local: " + date1);

        LocalDateTime date2 = LocalDateTime.now();
        System.out.println("Data local com horas: " + date2);

        // Intanciar hora global
        Instant date3 = Instant.now();
        System.out.println("Hora global com timezone: " + date3);

        // Transformar ISO 8601 -> Data
        LocalDate date4 = LocalDate.parse("2023-12-06");
        System.out.println("ISO 8601: " + date4);

        // Transformar ISO 8601 -> Data-Hora
        LocalDateTime date5 = LocalDateTime.parse("2023-12-06T19:23:13.874");
        System.out.println("ISO 8601 com hora: " + date5);

        // Transformar ISO 8601 -> Data-Hora e Timezone data hora global
        Instant date6 = Instant.parse("2023-12-06T19:23:13.874Z");
        System.out.println("ISO 8601 com hora: " + date6);

        // Transformar ISO 8601 -> Data-Hora e Timezone data hora global fuso Brasil
        Instant date7 = Instant.parse("2023-12-06T19:23:13.874Z");
        ZonedDateTime nowZoned = date7.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime nowZoned2 = date7.atZone(ZoneId.of("-03:00"));
        System.out.println("ISO 8601 com hora e fuso-horario Brasil: " + nowZoned);
        System.out.println("ISO 8601 com hora e fuso-horario Brasil: " + nowZoned);

        //Texto formato customizado
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date8 = LocalDate.parse("12/07/2023", formatter1);
        System.out.println("Texto customizado: " + date8);


    }
}