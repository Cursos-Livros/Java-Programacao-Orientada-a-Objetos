package Desafio.entities;

public abstract class Lesson {
    private String tittle;

    public Lesson() {
    }

    public Lesson(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public abstract int duration();
}
