package exercicios.exercicio9.entities;

public class Aluno {
    private String name;
    private double grade1;
    private double grade2;

    public Aluno(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void approved() {
        double average = (grade1 + grade2) / 2.0;
        if (average > 6.0) {
            System.out.println(name);
        }
    }
}
