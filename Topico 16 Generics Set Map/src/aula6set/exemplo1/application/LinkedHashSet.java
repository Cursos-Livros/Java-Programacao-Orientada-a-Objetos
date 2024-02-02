package aula6set.exemplo1.application;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        // Mantem a ordem que os elementos foram inseridos
        Set<String> set = new java.util.LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3);



        System.out.println(set.contains("Notebook"));

        for (String string : set) {
            System.out.println(string);
        }
    }
}
