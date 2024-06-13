package aula6set.exemplo1.application;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetexample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));

        for (String string : set) {
            System.out.println(string);
        }
    }
}
