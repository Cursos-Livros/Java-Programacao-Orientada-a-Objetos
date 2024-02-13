package aula2predicate.expressaolambdainline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Mouse", 50));
        listProduct.add(new Product("Tablet", 450));
        listProduct.add(new Product("HD Case", 80.90));

        // Método removeIf
        // Recebe uma funcao anonima e como implementar como argumento da funcao removeIf
        listProduct.removeIf(product -> product.getPrice() >= 100);

        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
