package aula3calculosdatahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();
        ZonedDateTime date4 = ZonedDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Date 1 formatado =  " + date1.format(formatter1));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Date 2 formatado =  " + date2.format(formatter2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("Date 3 formatado = " + formatter3.format(date3));

        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("Date 3 formatado = " + formatter4.format(date3));
    }
}
