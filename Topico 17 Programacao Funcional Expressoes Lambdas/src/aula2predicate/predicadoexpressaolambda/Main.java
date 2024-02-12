package aula2predicate.predicadoexpressaolambda;

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
        // Recebe um predicado
        // Nesse caso expressão lambda
        // Lembre-se expressoes lambdas e interfaces funcionais são equivalentes
        listProduct.removeIf(p -> p.getPrice() >= 100);

        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
