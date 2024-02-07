package exerciciodefixacaoSet.application;

import exerciciodefixacaoSet.entities.Course;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Course> set = new HashSet<>();

        System.out.println("How many students for course A?");
        int quantityStudents = scanner.nextInt();

        for (int i = 0; i < quantityStudents; i++) {
            int studentCode = scanner.nextInt();
            set.add(new Course(studentCode));
        }

        System.out.println("Total Students: " + set.size());
    }
}
