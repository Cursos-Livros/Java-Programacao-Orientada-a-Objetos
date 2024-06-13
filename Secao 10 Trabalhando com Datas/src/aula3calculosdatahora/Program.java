package aula3calculosdatahora;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();
        ZonedDateTime date4 = ZonedDateTime.now();

        LocalDate pastWeekLocalDate = date1.minusWeeks(1);
        LocalDate nextWeelLocalDate = date1.plusWeeks(1);
        System.out.println("Data 1 - 1 semana: " + pastWeekLocalDate);
        System.out.println("Data 1 + 1 semana: " + nextWeelLocalDate);

        System.out.println("-----------------------------------------------");

        LocalDateTime pastWeekLocalDateTime = date2.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = date2.plusWeeks(1);
        System.out.println("Data 2 -1 semana: " + pastWeekLocalDate);
        System.out.println("Data 2 +1 semana: " + nextWeelLocalDate);

        System.out.println("-----------------------------------------------");

        Instant pastWeekLocalInstant = date3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = date3.plus(1, ChronoUnit.DAYS);
        System.out.println("Data 3 -1 semana: " + pastWeekLocalDate);
        System.out.println("Data 3 +1 semana: " + nextWeelLocalDate);

        System.out.println("-----------------------------------------------");

        Duration time1 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
        System.out.println("Diferença entre 2 datas = " + time1.toDays());

    }
}
