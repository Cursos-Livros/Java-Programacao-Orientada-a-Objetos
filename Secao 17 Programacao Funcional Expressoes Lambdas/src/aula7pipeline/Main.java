package aula7pipeline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        // Pipeline
        // Faz o produto de todos os numeros pares
        System.out.println(Arrays.toString(list.stream().filter(x -> x % 2 == 0).toArray()));
    }
}
