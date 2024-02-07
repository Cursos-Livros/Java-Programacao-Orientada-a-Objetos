package exerciciodefixacaoSet.entities;

import java.util.Objects;

public class Course {
    private int code;

    public Course(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code == course.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
