package Desafio.application;

import Desafio.entities.Lesson;
import Desafio.entities.Task;
import Desafio.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        System.out.println("Quantas aulas tem o curso?");
        int lessonQuantity = readLessonQuantity();

        List<Lesson> listLesson = new ArrayList<>();

        for (int i = 0; i < lessonQuantity; i++) {
            System.out.println("Dados da " + (i + 1) + "a aula:");
            System.out.println("Conteúdo ou tarefa (c/t)?");
            char lessonTypeOption = readLessontypeOption();
            Lesson lessonType = lessonType(lessonTypeOption);
            listLesson.add(lessonType);
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO");
        showTotalDuration(listLesson);
    }

    public static int readLessonQuantity() {
        Scanner scanner = new Scanner(System.in);
        int newLessonQuantity = scanner.nextInt();
        return lessonQuantity(newLessonQuantity);
    }

    public static int lessonQuantity(Integer lessonQuantity) {
        Scanner scanner = new Scanner(System.in);

        int newLessonQuantity = lessonQuantity;
        while (newLessonQuantity < 0) {
            System.out.println("The video can has just positive value!");
            System.out.println("Enter the quantity again:");
            newLessonQuantity = scanner.nextInt();
        }

        return newLessonQuantity;
    }

    public static char readLessontypeOption() {
        Scanner scanner = new Scanner(System.in);
        char lessonTypeOption = scanner.next().charAt(0);
        return LessonTypeOptionError(lessonTypeOption);
    }

    public static char LessonTypeOptionError(char lessonTypeOption) {
        Scanner scanner = new Scanner(System.in);
        char newLessonTypeOption = lessonTypeOption;

        while (newLessonTypeOption != 'c' && newLessonTypeOption != 't') {
            System.out.println("Este conteudo de tarefa nao é permitido!");
            System.out.println("Por favor entre com c ou d.");
            newLessonTypeOption = scanner.next().charAt(0);
        }

        return newLessonTypeOption;
    }

    public static Lesson lessonType(char lessonTypeOption) {
        Lesson lessonType = null;
        if (lessonTypeOption == 'c') {
            lessonType = videoContent();
        }

        if (lessonTypeOption == 't') {
            lessonType = taskContent();
        }
        return lessonType;
    }

    public static Lesson videoContent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Título:");
        String tittle = scanner.nextLine();

        System.out.println("URL do vídeo:");
        String url = scanner.nextLine();

        System.out.println("Duração em segundos:");
        int videoDuration = readVideoDuration();

        Lesson video = new Video(tittle, url, videoDuration);

        return video;
    }

    public static Integer readVideoDuration() {
        Scanner scanner = new Scanner(System.in);
        int newVideoDuration = scanner.nextInt();
        if (newVideoDuration < 0) {
            newVideoDuration = videoDurationError(newVideoDuration);
        }
        return newVideoDuration;
    }

    public static Integer videoDurationError(int videoDuration) {
        Scanner scanner = new Scanner(System.in);

        int newVideoDuration = videoDuration;
        while (newVideoDuration < 0) {
            System.out.println("This number is not permitted to video duration");
            System.out.println("enter the video duration again:");
            newVideoDuration = scanner.nextInt();
        }
        return newVideoDuration;
    }

    public static Lesson taskContent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Título:");
        String tittle = scanner.nextLine();

        System.out.println("Descricao:");
        String description = scanner.nextLine();

        System.out.println("Quantidade de questões:");
        int questionQuantity = readQuestionQuantity();

        Lesson task = new Task(tittle, description, questionQuantity);

        return task;
    }

    public static int readQuestionQuantity() {
        Scanner scanner = new Scanner(System.in);

        int questionQuantity = scanner.nextInt();
        if (questionQuantity < 0) {
            questionQuantity = questQuantityError(questionQuantity);
        }
        return questionQuantity;
    }

    public static int questQuantityError(Integer questionQuantity) {
        Scanner scanner = new Scanner(System.in);
        int newQuestQuantityError = questionQuantity;

        while (newQuestQuantityError < 0) {
            System.out.println("Esse numero de questoes nao é permitido!");
            System.out.println("Por favor use um entre com um numero maior que 0.");
            newQuestQuantityError = scanner.nextInt();
        }
        return newQuestQuantityError;
    }

    public static void showTotalDuration(List<Lesson> listLesson) {
        int sumDurationLesson = 0;

        for (Lesson lesson : listLesson) {
            sumDurationLesson += lesson.duration();
        }

        System.out.println(sumDurationLesson + " segundos.");
    }
}
