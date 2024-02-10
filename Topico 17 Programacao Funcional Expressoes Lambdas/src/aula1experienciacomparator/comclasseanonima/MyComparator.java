package aula1experienciacomparator.semclasseanonima;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        // Código sobre como comparar
        // método compareTo compara lexigrafico modo de dicionário
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}
