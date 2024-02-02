package aula6set.exemplo1.application;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String string : set) {
            System.out.println(string);
        }
    }
}
