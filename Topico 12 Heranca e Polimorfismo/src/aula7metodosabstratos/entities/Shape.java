package aula7metodosabstratos.entities;

import aula7metodosabstratos.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método Abstrato criado
    // Sem colchetes pois não havera bloco de codigo
    public abstract double area();
}
