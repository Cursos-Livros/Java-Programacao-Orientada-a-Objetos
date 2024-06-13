package aula2predicate.expressaolambdadeclarada;

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

        // Variavel do tipo predicate
        // Recebe uma funcao anonima e como implementar
        // Pode ser o valor de uma variavel
        Predicate<Product> predicate = product -> product.getPrice() >= 100;

        // Método removeIf
        listProduct.removeIf(predicate);

        for (Product product : listProduct) {
            System.out.println(product.toString());
        }
    }
}
