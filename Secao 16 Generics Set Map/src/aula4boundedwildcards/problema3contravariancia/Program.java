package aula4boundedwildcards.problema3contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Object> myObjects = new ArrayList<>();
        myObjects.add("Olga");
        myObjects.add("Maria");

        List<? super Number> myNumbers = myObjects;

        myNumbers.add(10);
        myNumbers.add(20);

        System.out.println(myNumbers.toString());

        // Erro de compilação
        // myNumber.get(0);
    }
}
