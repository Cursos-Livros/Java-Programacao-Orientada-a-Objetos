package aula112_ConvertendoDataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Usando classe DateTimeFormatter - para formatar datas
        // Cuidado aqui estamos transformando uma data em um formato diferente para o formato Local Date
        // Aqui temos um formatter que diz ao Localdate como interpretar o texto
        // Esquece que os padrões que podem ser interpretados estão todos disponíveis na documentação

        // Formatar Data e Hora
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date6 = LocalDate.parse("30/10/2025", formatter1);
        System.out.println(date6);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime date7 = LocalDateTime.parse("31/10/2025 20:00", formatter2);
        System.out.println("Data e hora formatadas: " + date7);

        // Converter para horario local - não importa a timezone
        LocalDateTime date8 = LocalDateTime.of(2025, 10, 31, 20, 06);
        System.out.println("Converter para LocalDateTime através dos elementos separados:" + date8);
    }
}
