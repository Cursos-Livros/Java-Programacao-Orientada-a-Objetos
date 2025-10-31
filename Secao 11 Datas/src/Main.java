import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Demonstração de Hora - Data

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

        // Usando classe DateTimeFormatter - para formatar datas
        // Cuidado aqui estamos transformando uma data em um formato diferente para o formato Local Date
        // Aqui temos um formatter que diz ao Localdate como interpretar o texto
        // Esquece que os padrões que podem ser interpretados estão todos disponíveis na documentação

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date6 = LocalDate.parse("30/10/2025", formatter1);
        System.out.println(date6);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime date7 = LocalDateTime.parse("31/10/2025 20:00", formatter2);
        System.out.println("Data e hora formatadas: " + date7);

        // Converter para horario local - não importa a timezone
        LocalDateTime date8 = LocalDateTime.of(2025,10,31,20,06);
        System.out.println("Converter para LocalDateTime através dos elementos separados:" +  date8);
    }
}