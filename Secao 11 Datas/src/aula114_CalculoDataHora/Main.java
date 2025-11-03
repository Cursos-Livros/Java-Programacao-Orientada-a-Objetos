package aula114_CalculoDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Calculo com Data Local
        LocalDate date01 = LocalDate.parse("2025-11-03");
        LocalDate pastWeek = date01.minusWeeks(1);
        LocalDate plus1Week = date01.plusWeeks(1);
        System.out.println("Data atual: " + date01 + " Data menos 7 dias: " + pastWeek);
        System.out.println("Data atual: " + date01 + " Data mais 7 dias: " + plus1Week);

        // Calculo com Data e Hora
        LocalDateTime date2 = LocalDateTime.parse("2025-11-03T16:30:30");
        LocalDateTime pastWeekLocalDateTime = date2.minusDays(7);
        LocalDateTime plusWeekLocalDateTime = date2.plusDays(7);
        System.out.println("Data atual LocalDateTime: " + date2 + " Data menos 7 dias: " + pastWeekLocalDateTime);
        System.out.println("Data atual LocalDateTime: " + date2 + " Data mais 7 dias: " + plusWeekLocalDateTime);

        // Calculo com Data Hora Global
        Instant date03 = Instant.parse("2025-11-03T01:30:30Z");
        Instant pastWeekInstant = date03.minus(7, ChronoUnit.DAYS);
        Instant plusWeekInstant = date03.plus(7, ChronoUnit.DAYS);
        System.out.println("Data atual Instant: " + date03 + " Data menos 7 dias: " + pastWeekInstant);
        System.out.println("Data atual Instant: " + date03 + " Data mais 7 dias: " + plusWeekInstant);

        // Calculos Duração
        // Classe Duration
        Duration duration1 = Duration.between(pastWeekInstant,plusWeekInstant);
        System.out.println("Duração entre : " + pastWeekInstant + " e " + plusWeekInstant + " = " + duration1.toDays());


    }
}
