package aula8igualdadetreeset;

import aula8igualdadetreeset.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Product> listProduct = new TreeSet<>();

        listProduct.add(new Product("Tv", 900.0));
        listProduct.add(new Product("Notebook", 1200.0));
        listProduct.add(new Product("Tablet", 1200.0));

        // Se nao colocar o compare to, ele nao consegue percorrer
        // pois coleções so conseguem comparar tipos que implementam comparable
        // Ordena por ordem alfabetica
        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
