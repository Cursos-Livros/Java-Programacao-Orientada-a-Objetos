package aula2predicate.referencemthodmetodoestatico;

import aula2predicate.referencemthodmetodoestatico.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Mouse", 50));
        listProduct.add(new Product("Tablet", 450));
        listProduct.add(new Product("HD Case", 80.90));

        // Método removeIf
        // Também pode ser implementado com um Reference Method
        // Reference Method - Metodo statico de uma classe
        // Referencia nesse caso é a Classe ::
        // Depois o método
        // Logo temos Classe::metodo
        listProduct.removeIf(Product::staticProductPredicate);

        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
