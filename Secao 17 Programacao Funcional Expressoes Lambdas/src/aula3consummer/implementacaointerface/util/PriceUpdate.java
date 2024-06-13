package aula3consummer.implementacaointerface.util;


import aula2predicate.referencemthodmetodoestatico.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        // Utilizamos 1.1
        // Aumento Percentual
        // Sua forma decimal é equivalente aos valores existente entre 0 e 1
        // Quando temos um aumento percentual, devemos multiplicar o valor original por (1 + %),
        // onde % é a porcentagem de aumento, em sua forma decimal.
        product.setPrice(product.getPrice() * 1.1);
    }
}
