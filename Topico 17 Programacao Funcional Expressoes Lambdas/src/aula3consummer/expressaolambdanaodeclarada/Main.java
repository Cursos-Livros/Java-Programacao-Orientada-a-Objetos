package aula3consummer.expressaolambdanaodeclarada;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Mouse", 50));
        listProduct.add(new Product("Tablet", 450));
        listProduct.add(new Product("HD Case", 80.90));

        // Método foreach
        // Percorre toda colecao
        // Executa um consummer para cada elemento
        // Implentado com expressao lambda nao declarada
        // Expressao lambda nao declarada
        // Argumento da funcao
        listProduct.forEach(product -> product.setPrice(product.getPrice() * 1.1));

        // Método foreach
        // Utilizando reference method
        listProduct.forEach(System.out::println);
    }
}
