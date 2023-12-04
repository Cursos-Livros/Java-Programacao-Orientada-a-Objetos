package aula8list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        // Instanciar Lista
        List<String> list = new ArrayList<String>();

        // Adicionar elemento
        list.add("Jose");
        list.add("Olga");
        list.add("Abby");
        list.add("Alloy");

        for (String moradores : list) {
            System.out.println(moradores);
        }

        System.out.println();

        // Inserir elemento
        System.out.println("Add elemento na lista:");
        list.add(2, "Brenda");

        for (String moradores : list) {
            System.out.println(moradores);
        }

        System.out.println();

        // Tamanho lista
        System.out.println("Tamanho da lista:");
        System.out.println(list.size());

        System.out.println();

        // Remove elemento
        System.out.println("Removendo elemento da lista:");
        System.out.println(list.remove("Brenda"));
        list.add(2, "Eliziane");

        for (String moradores : list) {
            System.out.println(moradores);
        }

        System.out.println();

        System.out.println("Removendo elemento lista pelo indice:");
        list.remove(2);

        for (String moradores : list) {
            System.out.println(moradores);
        }

        System.out.println();

        //Removendo por predicado
        System.out.println("Removendo por predicado:");
        list.add(2, "Eliziane");
        list.removeIf(x -> x.charAt(0) == 'J'); // O predicado recebe um elemento e faz algo com aquele mesmo elemento

        for (String moradores : list) {
            System.out.println(moradores);
        }

        // Encontrar posicao elemento
        System.out.println("Encontrando indice elemento:");
        System.out.println(list.indexOf("Abby"));

        System.out.println();

        // Filtrar Lista
        System.out.println("Filtrar listas com stream:");
         List<String> cats = list.stream().filter(cat -> cat.charAt(0) == 'A').collect(Collectors.toList());
        for (String moradores : cats) {
            System.out.println(moradores);
        }

        System.out.println();

        // Encontrar elemento lista
        String name = list.stream().filter(cat -> cat.charAt(0) == 'A').findFirst().orElseGet(null);
        System.out.println(name);
    }
}
