package aula4boundedwildcards.problema2covariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        List<? extends Number> list = integerList;

        Number x = list.get(0);

        // Erro compilação
        // list.add(3)
    }
}
