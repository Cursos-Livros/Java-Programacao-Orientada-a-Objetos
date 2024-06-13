package aula1experienciacomparator.comclasseanonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Notebook", 1200));
        listProduct.add(new Product("Tablet", 450));

        // Classe anonima
        // Classe que é modelada dentro do programa principal
        // Mas verbosa demais
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                // Código sobre como comparar
                // método compareTo compara lexigrafico modo de dicionário
                return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
            }
        };

        // Método sort
        // Tipo de método classe list
        // Ordena apenas objetos que implementam a interface Comparator
        // Ou seja o método necessita de um objeto comparator (uma classe) que o diga como comparar
        listProduct.sort(comparator);

        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}