package _Aula1ComecandoResolverSegundoExemplo.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity; // this palavra reservada que referencia o atributo do objeto
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    // A funcao to string sobrescreve a funcao to string da super Classe Object
    // A Classe Object é uma classe mãe todas as classes descendem delas
    // Por isso todas as classes possuem métodos padrões como to string
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + "units, Total: $ " + String.format("%.2f", totalValueStock());
    }
}
