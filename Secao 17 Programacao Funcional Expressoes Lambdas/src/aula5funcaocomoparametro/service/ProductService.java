package aula5funcaocomoparametro.service;

import aula5funcaocomoparametro.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : list) {
            // O teste antes era um predicado product.getName().charAt(0) == 'T'
            // Após implementar no seu argumento que uma classe pode receber um predicado
            // Basta chamar o predicado e sua funcao
            // Poderia ser outra interface funcional
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
