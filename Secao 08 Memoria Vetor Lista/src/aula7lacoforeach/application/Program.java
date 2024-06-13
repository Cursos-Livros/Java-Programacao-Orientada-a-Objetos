package aula7lacoforeach.application;

public class Program {
    public static void main(String[] args) {
        String[] names = new String[]{"Jose", "Olga", "Abby", "Alloy"};

        // Laço for each
        for (String moradores : names) {
            System.out.println(moradores);
        }
    }
}
