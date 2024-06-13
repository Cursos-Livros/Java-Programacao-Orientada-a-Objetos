package aula3exerciciocomposicao.application;

import aula3exerciciocomposicao.entities.Comment;
import aula3exerciciocomposicao.entities.Post;
import com.sun.org.apache.xml.internal.utils.LocaleUtility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title of post:");
        String tittle = scanner.nextLine();

        System.out.println("Enter the content of post:");
        String content = scanner.nextLine();

        System.out.println("Enter the first comment:");
        String comment01 = scanner.nextLine();
        Comment comment1 = new Comment(comment01);

        System.out.println("Enter the second comment:");
        String comment02 = scanner.nextLine();
        Comment comment2 = new Comment(comment02);

        System.out.println("Numeber of Likes:");
        int numberLikes = scanner.nextInt();

        System.out.println("Enter the moment of post");
        String date = scanner.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);

        Post post1 = new Post(localDate, tittle, content, numberLikes);

        post1.addComments(comment1);
        post1.addComments(comment2);

        System.out.println(post1);
    }
}
