package aula5funcaocomoparametro;


import aula5funcaocomoparametro.service.ProductService;

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

        ProductService productService = new ProductService();

        // Passando uma expressao lambda como argumento para a funcao filtered sum
        double sum = productService.filteredSum(listProduct, product -> product.getName().charAt(0) == 'T');

        System.out.println("Sum= " + String.format("%.2f", sum));

    }
}
