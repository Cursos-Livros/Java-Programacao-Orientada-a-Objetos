package aula6stream.application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7);

        // Stream
        // Sequencia de elementos
        // Solução para processar sequencia de dados

        // Cria a Stream
        Stream<Integer> stream1 = list.stream().map(x -> x * 10);

        // Printa a stream
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<String> stream2 = Stream.of("Abby", "Alloy");
        // Retorna um array formado pela stream
        // Depois transforma o array em string
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> -x + 2);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));

        // Sequencia de Fibonnaci
        // Funcao iterate itera sobre dados onde o dado da frente sempre é um implementação do dado anterior
        //
        Stream<Long> fibonnaci = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonnaci.limit(10).toArray()));
    }
}
