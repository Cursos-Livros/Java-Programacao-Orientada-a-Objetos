package aula4function.interfacefuncional;


import aula4function.interfacefuncional.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(new Product("TV", 900));
        listProduct.add(new Product("Mouse", 50));
        listProduct.add(new Product("Tablet", 450));
        listProduct.add(new Product("HD Case", 80.90));

        // Funcao map
        // Aplicada sobre uma stream
        // Aplica a funcao que esta sendo passada como argumento
        // A todos os elementos da stream
        // Entao é necessario converter antes
        // Depois reconverte-la para stream novamente
        List<String> names = listProduct.stream().map(new UpperCaseName()).collect(Collectors.toList()); // converte para stream e depoischama a funcao map

        names.forEach(System.out::println);
    }
}
