package aula2predicate.expressaolambdainline.util;

import aula2predicate.expressaolambdainline.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
