package aula2predicate.referencemethodnaoestatico.util;



import aula2predicate.referencemethodnaoestatico.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
