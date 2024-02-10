package aula1experienciacomparator.semclasseanonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Notebook", 1200));
        listProduct.add(new Product("Tablet", 450));

        // Método sort
        // Tipo de método classe list
        // Ordena apenas objetos que implementam a interface Comparator
        // Ou seja o método necessita de um objeto comparator (uma classe) que o diga como comparar
        listProduct.sort(new MyComparator());

        for(Product product: listProduct){
            System.out.println(product.toString());
        }
    }
}