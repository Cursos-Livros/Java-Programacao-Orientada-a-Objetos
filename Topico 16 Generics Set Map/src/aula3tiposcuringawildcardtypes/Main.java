package aula3tiposcuringawildcardtypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);


    }

    public static void printList(List<?> list) {
//        list.add(3); Proibido - Compilador não sabe qual o tipo compativel em tempo de execucao
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
