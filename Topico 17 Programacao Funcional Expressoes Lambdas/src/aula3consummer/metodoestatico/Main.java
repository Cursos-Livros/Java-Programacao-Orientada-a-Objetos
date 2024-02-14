package aula3consummer.metodoestatico;

import aula2predicate.referencemthodmetodoestatico.Product;
import aula3consummer.metodoestatico.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

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
        // Implentado com interface funcional consummer
        listProduct.forEach(new PriceUpdate());

        // Método foreach
        // Utilizando reference method
        listProduct.forEach(System.out::println);
    }
}
