package aula3consummer.implementacaointerface;

import aula2predicate.referencemthodmetodoestatico.Product;
import aula3consummer.implementacaointerface.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<aula2predicate.referencemthodmetodoestatico.Product> listProduct = new ArrayList<>();

        listProduct.add(new aula2predicate.referencemthodmetodoestatico.Product("TV", 900));
        listProduct.add(new aula2predicate.referencemthodmetodoestatico.Product("Mouse", 50));
        listProduct.add(new aula2predicate.referencemthodmetodoestatico.Product("Tablet", 450));
        listProduct.add(new aula2predicate.referencemthodmetodoestatico.Product("HD Case", 80.90));

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
