package aula98_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Sem tipo primitivos so wrapper class

        list.add("Abby");
        list.add("Alloy");
        list.add("Jose");
        list.add("Olga");
        list.add(2, "Alloy"); // add elemento na lista


        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        System.out.println("List Size:");
        System.out.println(list.size());

        System.out.println("--------------------------------------");
        System.out.println("List Remove:");
        list.remove("Alloy");
        list.remove(1);

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        System.out.println("List Remove with predicate");
        list.removeIf(x -> x.charAt(0) == 'A');

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        System.out.println("Element by position");
        System.out.println("Index of Jose:" + list.indexOf("Jose"));
        System.out.println("Index of Jose:" + list.indexOf("Abby"));

        System.out.println("--------------------------------------");
        System.out.println("Filter List:");
        List <String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
        System.out.println(result);
    }
}
