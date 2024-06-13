package exercicios.exercicio9.application;

import exercicios.exercicio9.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados?");
        int numberQuantity = scanner.nextInt();
        scanner.nextLine();

        Aluno[] students = new Aluno[numberQuantity];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:%n", i + 1);
            String studentName = scanner.nextLine();
            double studentGrade1 = scanner.nextDouble();
            double studentGrade2 = scanner.nextDouble();
            scanner.nextLine();
            students[i] = new Aluno(studentName, studentGrade1, studentGrade2);
        }

        // Verificar os aprovados

        for (int i = 0; i < students.length; i++) {
            students[i].approved();
        }
    }
}
