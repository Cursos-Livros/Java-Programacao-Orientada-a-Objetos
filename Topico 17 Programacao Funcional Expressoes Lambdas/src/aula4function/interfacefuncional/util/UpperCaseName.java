package aula4function.interfacefuncional.util;



import aula4function.interfacefuncional.Product;

import java.util.function.Consumer;
import java.util.function.Function;

// Function tem 2 tipos
// Entrada e Saida
public class UpperCaseName implements Function<Product,String> {
    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
