package Exercicios.Exercicio3.entities;

public class Student {
    public String name = "User";
    public double grade1 = 0.0;
    public double grade2 = 0.0;
    public double grade3 = 0.0;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public void studentStatus() {
        if (finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", missingPoints());
        } else {
            System.out.println("PASS");
        }
    }

    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

}
