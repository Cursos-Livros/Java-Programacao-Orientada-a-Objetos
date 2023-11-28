package Exercicios.Exercicio3.application;

import Exercicios.Exercicio3.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter with the name:");
        String name = scanner.nextLine();

        System.out.println("Enter with the grades:");
        System.out.println("Grade 1:");
        double grade1 = scanner.nextDouble();
        System.out.println("Grade 1:");
        double grade2 = scanner.nextDouble();
        System.out.println("Grade 1:");
        double grade3 = scanner.nextDouble();

        Student student = new Student();

        student.name = name;
        student.grade1 = grade1;
        student.grade2 = grade2;
        student.grade3 = grade3;

        System.out.printf("Final Grade: %.2f",student.finalGrade());
        System.out.println();

        student.studentStatus();
    }
}
