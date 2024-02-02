package aula7testeigualdadeset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> listProduct = new HashSet<>();

        listProduct.add(new Product("Tv", 900.0));
        listProduct.add(new Product("Notebook", 1200.0));
        listProduct.add(new Product("Tablet", 1200.0));

        Product product = new Product("Notebook", 1200.0);

        System.out.println(listProduct.contains(product));
    }
}
